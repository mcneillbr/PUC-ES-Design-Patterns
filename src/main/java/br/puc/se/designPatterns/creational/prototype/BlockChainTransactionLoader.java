package br.puc.se.designPatterns.creational.prototype;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockChainTransactionLoader implements Cloneable{
	
	public List<UserTransaction> loadTransactionsFromFile(String fileName) {
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
