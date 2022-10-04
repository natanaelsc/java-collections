package Optionals;

import java.math.BigDecimal;

public class ExempleTwo {
    public static void main(String[] args) {
        CatalogoProdutos catalogo = new CatalogoProdutos();
		
        // BigDecimal preco = catalogo.buscarPreco("Picanha 1kg").orElse(BigDecimal.ZERO);
		
		BigDecimal preco = catalogo.buscarPreco("Picanha 12kg")
				.orElseThrow(() -> new RuntimeException("Preço do produto não encontrado"));
		
		System.out.println(preco);
    }
}
