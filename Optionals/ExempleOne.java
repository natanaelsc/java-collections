package Optionals;

import java.math.BigDecimal;

public class ExempleOne {
    
    public static void main(String[] args) {
        CatalogoProdutos catalogo = new CatalogoProdutos();
		
		catalogo.buscarOptional("Picanha 1kg").stream().forEach(produto -> {
			produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
			
			System.out.println(produto.getPreco());
		});
    }
}
