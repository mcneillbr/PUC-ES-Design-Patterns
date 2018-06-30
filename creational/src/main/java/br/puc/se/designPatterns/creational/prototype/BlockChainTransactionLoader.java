package br.puc.se.designPatterns.creational.prototype;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map;
/**
 * 
 * @author ra00212217
 */

public class BlockChainTransactionLoader implements Cloneable{
	
	Map<String, List<UserTransaction>> cache;
	
	public BlockChainTransactionLoader() {
		this.cache = new HashMap<>();
	}
	
	private BlockChainTransactionLoader(Map<String, List<UserTransaction>> existentCache) {
		this.cache = new HashMap<>(existentCache);
	}

	public BlockChainTransactionLoader deepCopy() {
		return new BlockChainTransactionLoader(this.cache);
	}
	
	public List<UserTransaction> loadTransactionsFromFile(String fileName) {
		if (this.cache.containsKey(fileName)) {
			return this.cache.get(fileName);
		}
		return loadTheMessages(fileName);
	}
	
	private List<UserTransaction> loadTheMessages(String fileName) {
		try {
			Thread.sleep(600);
			return PrototypeUtils.readLinesFromResource(fileName);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return new LinkedList<>();
	}

    BlockChainTransactionLoader deepCopy() {
            try {
                return (BlockChainTransactionLoader) super.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(BlockChainTransactionLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
       // return new BlockChainTransactionLoader();
       return null;
    }
	
}
