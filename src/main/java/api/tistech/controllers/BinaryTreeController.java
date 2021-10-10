package api.tistech.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.tistech.model.BinaryTree;
import api.tistech.service.BinaryTreeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;


@RestController
@Api
@RequestMapping("")
@Slf4j
public class BinaryTreeController {
	
	 

	@Autowired
	BinaryTreeService binaryTreeService;
	
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna a soma dos nós adjacentes"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@RequestMapping(value = "/somarNos/{valor}", method = RequestMethod.GET, produces="application/json")
	public int somarNos(@RequestBody BinaryTree arvore, @PathVariable("valor") int valor) {
		log.info("Serviço de soma acessado com sucesso!");
		return binaryTreeService.somarAdjacente(arvore, valor);
	}
	
}
