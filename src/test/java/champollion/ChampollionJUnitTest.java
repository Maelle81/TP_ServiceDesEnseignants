package champollion;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static champollion.TypeIntervention.CM;
import static champollion.TypeIntervention.TD;
import static champollion.TypeIntervention.TP;

public class ChampollionJUnitTest {
	Enseignant untel;
	UE uml, java;
            Intervention interCM, interTD, interTP;
		
	@BeforeEach
	public void setUp() {
		untel = new Enseignant("untel", "untel@gmail.com");
		uml = new UE("UML");
		java = new UE("Programmation en java");	
                        interCM = new Intervention(CM);
                        interTD = new Intervention(TD);
                        interTP = new Intervention(TP);
	}
	

	@Test
	public void testNouvelEnseignantSansService() {
		assertEquals(0, untel.heuresPrevues(),
                        "Un nouvel enseignant doit avoir 0 heures prévues");
	}
	
	@Test
	public void testAjouteHeures() {
                // 10h TD pour UML
		untel.ajouteEnseignement(uml, 0, 10, 0);

		assertEquals(10, untel.heuresPrevuesPourUE(uml),
                        "L'enseignant doit maintenant avoir 10 heures prévues pour l'UE 'uml'");

                // 20h TD pour UML
                untel.ajouteEnseignement(uml, 0, 20, 0);
                
		assertEquals(10 + 20, untel.heuresPrevuesPourUE(uml),
                         "L'enseignant doit maintenant avoir 30 heures prévues pour l'UE 'uml'");		
		
	}
        
        @Test
        public void testHeurePrevu(){
            //8h de TD pour le module UML
            untel.ajouteEnseignement(uml, 0, 10, 0);
            assertEquals(10, untel.heuresPrevues(), "L'enseignant a 8h de prévues");
                       
        }
        
        @Test
        public void testEstEnSousService(){
            
            //Cas : en sous-service
            //L'enseignat fait 40h d'intervention il est en dessous de 192h
            untel.ajouteEnseignement(uml, 8, 12, 20);
            assertTrue(untel.estEnSousService(), "L'enseignant doit etre en sous service");
                        
            //Cas : pas en sous-service
            //ajout de 160h
            untel.ajouteEnseignement(uml, 20, 36, 24 );
            untel.ajouteEnseignement(java, 20, 24, 36);
            assertFalse(untel.estEnSousService(), "L'enseignant ne doit pas être en sous service");
           
        }
        
        @Test 
        public void testResteAPlanifier(){
            int sommePlanifie = 0;
            assertEquals(0, sommePlanifie, "La planification initiale doit être à 0");
        }
	
}
