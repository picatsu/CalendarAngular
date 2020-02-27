package com.bada.config;


import com.bada.model.UN_TYPE_ACTIVITE;
import com.bada.service.*;
import com.bada.service.serviceIMPL.*;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class AppConfig {


    @Bean
    public SAUVEGARDE_SERVICE SAUVEGARDEService() {
        return new SAUVEGARDE_SERVICEIMPL();
    }

    @Bean
    public LES_PARAMETRES_GENERAUX_SERVICE LES_PARAMETRES_GENERAUX_SERVICEService() {
        return new LES_PARAMETRES_GENERAUX_SERVICEIMPL();
    }

    @Bean
    public UN_CNU_SERVICE UN_CNU_SERVICEService() {
        return new UN_CNU_SERVICEIMPL();
    }

    @Bean
    public UN_ENSEIGNEMENT_SERVICE UN_ENSEIGNEMENT_SERVICEService() {
        return new UN_ENSEIGNEMENT_SERVICEIMPL();
    }
    @Bean
    public UN_ETUDIANT_SERVICE UN_ETUDIANT_SERVICEService() {
        return new UN_ETUDIANT_SERVICEIMPL();
    }
    @Bean
    public UN_GRADE_SERVICE UN_GRADE_SERVICEService() {
        return new UN_GRADE_SERVICEIMPL();
    }
    @Bean
    public UN_GROUPES_SERVICE UN_GROUPES_SERVICEService() {
        return new UN_GROUPES_SERVICEIMPL();
    }
    @Bean
    public UN_NIVEAU_SERVICE UN_NIVEAU_SERVICEService() {
        return new UN_NIVEAU_SERVICEIMPL();
    }
    @Bean
    public UN_PROFESSEUR_SERVICE UN_PROFESSEUR_SERVICEService() {
        return new UN_PROFESSEUR_SERVICEIMPL();
    }
    @Bean
    public UNE_COMPOSANTE_SERVICE UNE_COMPOSANTE_SERVICEService() {
        return new UNE_COMPOSANTE_SERVICEIMPL();
    }
    @Bean
    public UNE_MATIERE_SERVICE UNE_MATIERE_SERVICEService() {
        return new UNE_MATIERE_SERVICEIMPL();
    }
    @Bean
    public UNE_PERIODE_SERVICE UNE_PERIODE_SERVICEService() {
        return new UNE_PERIODE_SERVICEIMPL();
    }
    @Bean
    public UNE_RESERVATION_SERVICE UNE_RESERVATION_SERVICEService() {
        return new UNE_RESERVATION_SERVICEIMPL();
    }
    @Bean
    public UNE_SALLE_SERVICE UNE_SALLE_SERVICEService() {
        return new UNE_SALLE_SERVICEIMPL();
    }


    @Bean
    public UNE_SEANCE_SERVICE UNE_SEANCE_SERVICEService() {
        return new UNE_SEANCE_SERVICEIMPL();
    }

    @Bean
    public UNE_ZONE_DE_SALLE_SERVICE UNE_ZONE_DE_SALLE_SERVICEService() {
        return new UNE_ZONE_DE_SALLE_SERVICEIMPL();
    }

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {

        MongoTemplate mongoTemplate =
                new MongoTemplate(new MongoClient("127.0.0.1"),"bada");
        return mongoTemplate;

    }



}
