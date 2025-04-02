// package CollectionsExerciciosPropostosSet;

/*
Crie uma conjunto contendo as cores do arco-�ris e:
a) Exiba todas as cores o arco-�ris uma abaixo da outra;
b) A quantidade de cores que o arco-�ris tem;
c) Exiba as cores em ordem alfab�tica;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que come�am com a letra �v�;
f) Remova todas as cores que n�o come�am com a letra �v�;
g) Limpe o conjunto;
h) Confira se o conjunto est� vazio;
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
	public static void main (String []args) {
		
        Set<String> coresArcoIris = new HashSet<>();
        	coresArcoIris.add("violeta");
        	coresArcoIris.add("anil");
        	coresArcoIris.add("azul");
        	coresArcoIris.add("verde");
        	coresArcoIris.add("amarelo");
        	coresArcoIris.add("laranja");
        	coresArcoIris.add("vermelho");
        	
        System.out.println(coresArcoIris);
        System.out.println(coresArcoIris.size());
        
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);
        
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);
        
        for (String cor: coresArcoIris) {
            if(!cor.isEmpty() && cor.startsWith("v")) System.out.println(cor);
        }
        
        coresArcoIris.clear();
        System.out.println(coresArcoIris);
        
        System.out.println("Cconjunto vazio: " + coresArcoIris.isEmpty());

        
       
	}
}
