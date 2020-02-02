class Person {
    constructor(name, dob) {
        this._id = undefined;
        this._rev = undefined;
        this.name = name;
        this.dob = dob;
    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
}







class UNE_SALLE {
    constructor(
        CODE,
        DATE_MODIFICATION,
        NOM,
        ALIAS,
        IDENTIFIANT,
        COMMENTAIRE,
        COMPOSANTE,
        CAPACITE,
        SURFACE,
        COULEUR,
        COULEUR_POLICE,
        CODE_PROPRIETAIRE,
        CODE_ZONE,
        TYPES_DE_LA_SALLE

      ) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COMMENTAIRE = COMMENTAIRE;
        this.COMPOSANTE = COMPOSANTE;
        this.CAPACITE = CAPACITE;
        this.SURFACE = SURFACE;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.CODE_ZONE = CODE_ZONE;
        this.TYPES_DE_LA_SALLE = TYPES_DE_LA_SALLE;

        

    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }

}




class UNE_RESSOURCE {
    constructor(TYPE, CODE_RESSOURCE) {
        this._id = undefined;
        this._rev = undefined;
        this.TYPE = TYPE;
        this.CODE_RESSOURCE = CODE_RESSOURCE;
    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
}


class UNE_RESERVATION {
    constructor( 
        CODE,
        DATE,
        HEURE,
        DUREE,
        COMMENTAIRE,
        CODE_PROPRIETAIRE,
        RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE = DATE;
        this.HEURE = HEURE;
        this.DUREE = DUREE;
        this.COMMENTAIRE = COMMENTAIRE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES = RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES;
       

    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
}




class UNE_PERIODE {
    constructor(UN_NOM_PERIODE, UNE_PERIODE) {
        this._id = undefined;
        this._rev = undefined;
        this.UN_NOM_PERIODE = UN_NOM_PERIODE;
        this.UNE_PERIODE = UNE_PERIODE;
    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
}

class LES_PARAMETRES_GENERAUX {
    constructor(NOM,
        HEURE_DEBUT,
        HEURE_FIN,
        GRAIN_TEMPOREL,
        DATE_DEBUT,
        DATE_FIN,
        MATIERES_V2,
        CALENDRIER) {
        this._id = undefined;
        this._rev = undefined;
        this.NOM = NOM;
        this.HEURE_DEBUT = HEURE_DEBUT;
        this.HEURE_FIN = HEURE_FIN;
        this.GRAIN_TEMPOREL = GRAIN_TEMPOREL;
        this.DATE_DEBUT = DATE_DEBUT;
        this.DATE_FIN = DATE_FIN; 
        this.MATIERES_V2 = MATIERES_V2;
        this.CALENDRIER = CALENDRIER;
      
    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
}


class UN_NIVEAU { 
    constructor(
        CODE,
        DATE_MODIFICATION,
        NOM,
        ALIAS,
        COMMENTAIRE,
        IDENTIFIANT,
        COULEUR,
        COULEUR_POLICE,
        CODE_PROPRIETAIRE,
        TYPE_ELEMENT) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.COMMENTAIRE = COMMENTAIRE;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.TYPE_ELEMENT = TYPE_ELEMENT;

    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }



}



class UNE_MATIERE { 
    constructor(
        CODE,
        DATE_MODIFICATION,
        NOM,
        ALIAS,
        COMMENTAIRE,
        IDENTIFIANT,
        COULEUR,
        COULEUR_POLICE,
        CODE_PROPRIETAIRE,
        CODE_CNU) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.COMMENTAIRE = COMMENTAIRE;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.CODE_CNU = CODE_CNU;

    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }



}




class LES_MATERIELS {
    constructor(name) {
        this._id = undefined;
        this._rev = undefined;
        this.name = name;
    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
}


class CALENDRIER {
    constructor(LES_CONGES, UNE_JOURNEE) {
        this._id = undefined;
        this._rev = undefined;
        this.LES_CONGES = LES_CONGES;
        this.UNE_JOURNEE = UNE_JOURNEE;
     
    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }


}


class UN_GROUPE {
    constructor(CODE,
        DATE_MODIFICATION,
        NOM,
        ALIAS,
        COMMENTAIRE,
        COMPOSANTE,
        NIVEAU,
        DIPLOME,
        IDENTIFIANT,
        TYPE_PUBLIC,
        QUANTITE_MAX,
        COULEUR,
        COULEUR_POLICE,
        CODE_PROPRIETAIRE,
        LES_ETUDIANTS_DU_GROUPE, 
        CALENDRIER) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.COMMENTAIRE = COMMENTAIRE;
        this.COMPOSANTE = COMPOSANTE;
        this.NIVEAU = NIVEAU;
        this.DIPLOME = DIPLOME;
        this.IDENTIFIANT = IDENTIFIANT;
        this.TYPE_PUBLIC = TYPE_PUBLIC;
        this.QUANTITE_MAX = QUANTITE_MAX;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.LES_ETUDIANTS_DU_GROUPE = LES_ETUDIANTS_DU_GROUPE;
        this.CALENDRIER = CALENDRIER 

    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }

}




class UNE_PONDERATION {
    constructor(PONDERATION_TYPE,
        PONDERATION_STATUTAIRE,
        PONDERATION_SUPPLEMENTAIRE) {
        this._id = undefined;
        this._rev = undefined;
        this.PONDERATION_TYPE = PONDERATION_TYPE;
        this.PONDERATION_STATUTAIRE = PONDERATION_STATUTAIRE;
        this.PONDERATION_SUPPLEMENTAIRE = PONDERATION_SUPPLEMENTAIRE;
    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }


}


class UN_GRADE { 

    constructor(CODE,
        DATE_MODIFICATION,
        IDENTIFIANT,
        COMMENTAIRE,
        HEURES_STATUTAIRES,
        HEURES_COMPLEMENTAIRES,
        LES_PONDERATIONS) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COMMENTAIRE = COMMENTAIRE;
        this.HEURES_STATUTAIRES = HEURES_STATUTAIRES;
        this.HEURES_COMPLEMENTAIRES = HEURES_COMPLEMENTAIRES;
        this.LES_PONDERATIONS = LES_PONDERATIONS;
       

    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }

}



class UN_ETUDIANT{
    constructor( 
        CODE,
        DATE_MODIFICATION,
        NOM,
        PRENOM,
        PRENOM2,
        NAISSANCE,
        IDENTIFIANT,
        COMMENTAIRE,
        BOURSIER,
        COMPOSANTE,
        EMAIL,
        TYPE_PUBLIC,
        CODE_PROPRIETAIRE) {

        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.PRENOM2 = PRENOM2;
        this.NAISSANCE = NAISSANCE;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COMMENTAIRE = COMMENTAIRE;
        this.BOURSIER = BOURSIER;
        this.COMPOSANTE = COMPOSANTE;
        this.EMAIL = EMAIL;
        this.TYPE_PUBLIC = TYPE_PUBLIC;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;


    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
}



class UN_ENSEIGNEMENT {
    constructor(CODE,
        DATE_MODIFICATION,
        NOM,
        ALIAS,
        TYPE_ACTIVITE,
        COMPOSANTE,
        NIVEAU,
        COMMENTAIRE,
        IDENTIFIANT,
        CODE_PROPRIETAIRE,
        COULEUR,
        COULEUR_POLICE,
        CODE_MATIERE,
        DUREE_TOTALE,
        DUREE_CHAQUE_SEANCE,
        VOLUME_REPARTI,
        FORFAITAIRE,
        ARTICLE6,
        VOLUME_FORFAITAIRE,
        DATE_DEBUT,
        DATE_FIN,
        TYPE_PUBLIC,
        NB_SEANCES_HEBDO,
        CODE_TYPE_SALLE,
        CODE_ZONE_SALLE,
        LES_RESSOURCES
        ) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.TYPE_ACTIVITE = TYPE_ACTIVITE;
        this.COMPOSANTE = COMPOSANTE;
        this.NIVEAU = NIVEAU;
        this.COMMENTAIRE = COMMENTAIRE;
        this.IDENTIFIANT = IDENTIFIANT;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_MATIERE = CODE_MATIERE;
        this.DUREE_TOTALE = DUREE_TOTALE;
        this.DUREE_CHAQUE_SEANCE = DUREE_CHAQUE_SEANCE;
        this.VOLUME_REPARTI = VOLUME_REPARTI;
        this.FORFAITAIRE = FORFAITAIRE;
        this.ARTICLE6 = ARTICLE6;
        this.VOLUME_FORFAITAIRE = VOLUME_FORFAITAIRE;
        this.DATE_DEBUT = DATE_DEBUT;
        this.DATE_FIN = DATE_FIN;
        this.TYPE_PUBLIC = TYPE_PUBLIC;  
        this.NB_SEANCES_HEBDO = NB_SEANCES_HEBDO;
        this.CODE_TYPE_SALLE = CODE_TYPE_SALLE;
        this.CODE_ZONE_SALLE = CODE_ZONE_SALLE;
        this.LES_RESSOURCES = LES_RESSOURCES;


    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }

}



class ADRESSE {
    constructor(NUMERO,
        RUE,
        CODE_POSTAL,
        VILLE,
        PAYS,
        TELEPHONE,
        TELEPHONE2,
        EMAIL) {
        this._id = undefined;
        this._rev = undefined;
        this.NUMERO = NUMERO;
        this.RUE = RUE;
        this.CODE_POSTAL = CODE_POSTAL;
        this.VILLE = VILLE;
        this.PAYS = PAYS;
        this.TELEPHONE = TELEPHONE;
        this.TELEPHONE2 = TELEPHONE2;
        this.EMAIL = EMAIL;

    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
    
}


class UN_PROFESSEUR {

    constructor(CODE,
        DATE_MODIFICATION,
        NOM,
        PRENOM,
        PRENOM2,
        ALIAS,
        IDENTIFIANT_NATIONAL,
        IDENTIFIANT,
        COMMENTAIRE,
        COMPOSANTE,
        TITULAIRE,
        DATE_DOSSIER,
        NAISSANCE,
        CNU,
        GRADE,
        CODE_PROPRIETAIRE,
        COULEUR,
        COULEUR_POLICE,
        VOLUME_STAT_SPECIF,

        VOLUME_COMP_SPECIFIQUE,
        ADRESSE) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.PRENOM2 = PRENOM2;
        this.ALIAS = ALIAS;
        this.IDENTIFIANT_NATIONAL = IDENTIFIANT_NATIONAL;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COMMENTAIRE = COMMENTAIRE;
        this.COMPOSANTE = COMPOSANTE;
        this.TITULAIRE = TITULAIRE;
        this.DATE_DOSSIER = DATE_DOSSIER;
        this.NAISSANCE = NAISSANCE;
        this.CNU = CNU;
        this.GRADE = GRADE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.VOLUME_STAT_SPECIF = VOLUME_STAT_SPECIF;

        this.VOLUME_COMP_SPECIFIQUE = VOLUME_COMP_SPECIFIQUE;
        this.ADRESSE = ADRESSE;


    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }


}

class UNe_COMPOSANTES {
    constructor(CODE, DATE_MODIFICATION, NOM, ALIAS, COMMENTAIRE,
        IDENTIFIANT, TYPE_DE_COMPOSANTE, COULEUR, COULEUR_POLICE,
        CODE_PROPRIETAIRE) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.COMMENTAIRE = COMMENTAIRE;
        this.IDENTIFIANT = IDENTIFIANT;
        this.TYPE_DE_COMPOSANTE = TYPE_DE_COMPOSANTE;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;

    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }

}


class UN_CNU {
    constructor(CODE, SECTION, NOM, CODE_PROPRIETAIRE; DATE_MODIFICATION ) {
        this._id = undefined;
        this._rev = undefined;
        this.CODE = CODE;
        this.SECTION = SECTION;
        this.NOM = NOM;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
}

class SAUVEGARDE {
    constructor(DATE, VERSION, UTILISATEUR) {
        this._id = undefined;
        this._rev = undefined;
        this.DATE = DATE;
        this.VERSION = VERSION;
        this.UTILISATEUR = UTILISATEUR;
    }
    processAPIResponse(response) {
        if (response.ok === true) {
            this._id = response.id;
            this._rev = response.rev;
        }
    }
}





