package com.piyush.app.blockchain.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.piyush.app.blockchain.Block;

public class Utils {

	public static String generateHash(Block block) {

		String sha256hex = org.apache.commons.codec.digest.DigestUtils
				.sha256Hex(block.previousHash + "" + block.index + "" + block.timeStamp + "" + block.data);

		return sha256hex;
	}

	public static <E> String getPreviousHash(List<E> list) throws Exception {

		if (list.size() != 0) {
			Block block = (Block) list.get(list.size() - 1);
			String previousHash = block.getHash();
			if (previousHash != null && !previousHash.equals("")) {
				return previousHash;
			}
			else {
				throw new Exception("previous hash null or empty");
			}
		}
		else {
			return "firsthash";
		}
	}

	public static Map isBlockChainValid(List<Block> blockChainList) throws Exception {

		if (!blockChainList.isEmpty()) {
			if (blockChainList.size() > 1) {
				return validate(blockChainList);
			}
			else {
				throw new Exception("block chain is empty");
			}

		}
		else {
			throw new Exception("block chain is empty");

		}

	}

	private static Map validate(List<Block> blockChainList) {
		Block current;
		Block previous;
		Map<String, Object> result = new HashMap();
		for (int i = 1; i < blockChainList.size(); i++) {
			current = blockChainList.get(i);
			previous = blockChainList.get(i - 1);

			if (!previous.getHash().equals(current.getPreviousHash())) {
				result.put("block", blockChainList.get(i));
				result.put("index", i);
			}
		}

		return result;
	}
}
