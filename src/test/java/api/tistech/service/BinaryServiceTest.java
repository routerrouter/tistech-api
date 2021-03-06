package api.tistech.service;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import api.tistech.model.BinaryTree;

@RunWith(SpringRunner.class)
public class BinaryServiceTest {
	
	@Autowired
	BinaryTreeService binaryTreeServicee;
	
	@Autowired
	BinaryTree binaryTree;
	
	@TestConfiguration
	static class BianyTreeTestConfiguration {
		
		@Bean
		public BinaryTreeService binaryTreeService() {
			return new BinaryTreeService();
		}
	}
	
	
	@Test
	public void binaryTreeTestSomarNos() {
		
		int valor = 5;
		
		int soma = binaryTreeServicee.somarAdjacente(binaryTree, valor);
		
		Assertions.assertEquals(soma, 6);
		
	}
	
	@Before
	public BinaryTree setup() {
		
		BinaryTree noEsquerdo = new BinaryTree();
        noEsquerdo.setValor(2);
        
        BinaryTree noDireito = new BinaryTree();
        noDireito.setValor(4);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setValor(9);
        
   
        binaryTree.setLeft(noEsquerdo);
        binaryTree.setRight(noDireito);
		
		return binaryTree;
	}
	
	

}
