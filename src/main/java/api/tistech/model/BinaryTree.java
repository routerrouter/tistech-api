package api.tistech.model;

public class BinaryTree {

	private int valor;
	private BinaryTree left;
	private BinaryTree right;
	
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	 public static int somar(BinaryTree binaryTree) {
	        if (binaryTree == null) {
	            return 0;
	        }

	        return binaryTree.getValor()
	                + (binaryTree.getRight() == null ? 0 : somar(binaryTree.getRight()))
	                + (binaryTree.getLeft() == null ? 0 : somar(binaryTree.getLeft()));
	    }
	    
	    public static BinaryTree percorrer(BinaryTree binaryTree, int valor) {

	        if (binaryTree.getValor() == valor) {
	            return binaryTree;
	        }

	        if (binaryTree.getLeft() != null) {
	            BinaryTree ret = percorrer(binaryTree.getLeft(), valor);
	            if (ret != null) {
	                return ret;
	            }
	        }

	        if (binaryTree.getRight() != null) {
	            return percorrer(binaryTree.getRight(), valor);
	        }
	        return null;

	    }
}
