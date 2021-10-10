package api.tistech.service;

import org.springframework.stereotype.Service;

import api.tistech.model.BinaryTree;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BinaryTreeService {

	public static BinaryTree buscar(BinaryTree binaryTree, int valor) {
		return BinaryTree.percorrer(binaryTree, valor);
	}

	public int somarAdjacente(BinaryTree binaryTree, int valor) {

		log.info("Percorrendo Nós da árvore ...");
		BinaryTree arvore = BinaryTree.percorrer(binaryTree, valor);

		if (arvore == null) {
			log.warn("Valor não encontrado!");
			return 0;
		}

		int soma = BinaryTree.somar(arvore.getRight()) + BinaryTree.somar(arvore.getLeft());
		log.info("Soma dos Nós adjacentes = " + soma );
		return soma;
	}
}
