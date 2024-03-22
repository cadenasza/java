package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteSistema {

	public static void main(String[] args) {
		Cliente objCliente = new Cliente();
		Produto objProduto = new Produto();
		Endereco objEndereco = new Endereco();
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do cliente ")));
		objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura do cliente ")));
		
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Logradouro "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("numero ")));
		objEndereco.setCep(JOptionPane.showInputDialog("Cep "));
		objEndereco.setComplemento(JOptionPane.showInputDialog("Complemento "));
		objEndereco.setBairro(JOptionPane.showInputDialog("Bairro "));
		
		objCliente.setEndereco(objEndereco);

		objProduto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto ")));
		objProduto.setMarca(JOptionPane.showInputDialog("Marca do produto "));
		objProduto.setTipo(JOptionPane.showInputDialog("Tipo de produto "));
		objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor produto ")));
		
		System.out.println("-=-=-= Informações do Cliente =-=-=-" + 
				"\nnome: " + objCliente.getNome() + 
				"\nidade: " + objCliente.getIdade() + 
				"\nAltura: " + objCliente.getAltura() +
				"\nlogradouro: " + objCliente.getEndereco().getLogradouro() +
				"\nNumero: " + objCliente.getEndereco().getNumero() +
				"\nCep: " + objCliente.getEndereco().getCep() + 
				"\nComplemento: " + objCliente.getEndereco().getComplemento() +
				"\nBairro: " + objCliente.getEndereco().getBairro());
		
		System.out.println("\n\n -=-=-= Informações do Produto =-=-=-" +
				"\nCodigo: " + objProduto.getCodigo() +
				"\nMarca: " + objProduto.getMarca() +
				"\nTipo: " + objProduto.getTipo() + 
				"\nValor: " + objProduto.getValor());
	}

}
