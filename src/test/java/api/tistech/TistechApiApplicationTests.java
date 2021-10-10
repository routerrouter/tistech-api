package api.tistech;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


import api.tistech.model.BinaryTree;
import api.tistech.service.BinaryTreeService;
import api.tistech.service.NumerosService;

@SpringBootTest
@AutoConfigureMockMvc
class TistechApiApplicationTests {


    @Autowired
    BinaryTreeService binaryTreeService;
    
    @Autowired
    NumerosService numerosService;
	
	@Test
	void contextLoads() {
	}

	
	@Test
	void somarNos() throws Exception {
		
		
		BinaryTree noEsquerdo = new BinaryTree();
        noEsquerdo.setValor(2);
        
        BinaryTree noDireito = new BinaryTree();
        noDireito.setValor(4);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setValor(9);
        
   
        binaryTree.setLeft(noEsquerdo);
        binaryTree.setRight(noDireito);
		
		
		int binaryReturn = binaryTreeService.somarAdjacente(binaryTree, 9);


		Assertions.assertEquals(6, binaryReturn);
	}
	
	@Test
	void somarNosFail() throws Exception {
		
		BinaryTree noEsquerdo = new BinaryTree();
        noEsquerdo.setValor(2);
        
        BinaryTree noDireito = new BinaryTree();
        noDireito.setValor(4);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setValor(9);
        
   
        binaryTree.setLeft(noEsquerdo);
        binaryTree.setRight(noDireito);
		

		int soma = binaryTreeService.somarAdjacente(binaryTree, 9);
		
		Assertions.assertFalse(soma!=6);
	}
	
	@Test
	void terceiroNumero() throws Exception {
		
		
		String a = "102", b = "512";
		
		String c = numerosService.montagem(a, b);


		Assertions.assertEquals("150122", c);
	}
	
	@Test
	void terceiroNumeroMenosUm() throws Exception {
		
		
		String a = "10256", b = "512";
		
		String c = numerosService.montagem(a, b);


		Assertions.assertEquals("-1", c);
	}
}
