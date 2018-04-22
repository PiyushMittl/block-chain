package com.piyush.app.blockchain;
import java.util.List;

import com.piyush.app.blockchain.utils.Utils;

public class BlockChain {
	public Block generateBlock(Block block,List list) throws Exception{
		try {
			block.previousHash=Utils.getPreviousHash(list);
		}
		catch (Exception e) {
			throw new Exception("previous hash null or empty");
		}
		String hashCode=Utils.generateHash(block);
		block.setHash(hashCode);
		return block;
	}
}
