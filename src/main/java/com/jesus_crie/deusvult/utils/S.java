package com.jesus_crie.deusvult.utils;

public enum S {

    GENERAL_GAME_PATTERN("%shelp - v%s"),

    RESPONSE_FOOTER("%s"),
    RESPONSE_ERROR_COMMAND_CRASH("La commande a crashée, veuillez réessayez plus tard."),
    RESPONSE_ERROR_COMMAND_SYNTAX("Erreur de syntaxe, aucun pattern ne correspond."),
    RESPONSE_ERROR_COMMAND_NOT_FOUND("Cette commande n'éxiste pas."),
    RESPONSE_ERROR_COMMAND_GUILD_ONLY("Cette commande n'est pas disponible sur ce serveur."),
    RESPONSE_ERROR_COMMAND_WRONG_CONTEXT("Cette commande n'est pas autorisée dans ce contexte."),
    RESPONSE_ERROR_COMMAND_ACCESS_LEVEL("Vous n'avez pas les permissions requises pour cette commande."),
    RESPONSE_ERROR_COMMAND_MISSING_PERMISSION("Erreur: Il manque la permission %s"),

    TEAM_ROLE_PATTERN("Team - %s"),
    TEAM_CHANNEL_TEXT_NAME("group-%s"),
    TEAM_CHANNEL_TEXT_TOPIC("Channel de la team %s"),
    TEAM_CHANNEL_VOICE_NAME("\uD83C\uDF0F Groupe - %s"),

    COMMAND_TEST_HELP("Une commande de test, aucune utilitée."),

    COMMAND_STOP_HELP("Stoppe le bot, utilisable uniquement par le créateur."),
    COMMAND_STOP_SHUTTING_DOWN("Shutting down..."),

    COMMAND_EVAL_HELP("Execute du code en JS. Uniquement utilisable par le créateur."),
    COMMAND_EVAL_TITLE("Evaluation (JS / Nashorn)"),
    COMMAND_EVAL_TO_EVALUATE("Code à exécuter"),
    COMMAND_EVAL_RESULT("Resultat"),

    COMMAND_MATH_HELP("Calcule le resultat d'un calcul donné."),
    COMMAND_MATH_TITLE("Math"),
    COMMAND_MATH_EXPRESSION("Expression (math)"),
    COMMAND_MATH_RESULT("Resultat"),

    COMMAND_CLEAR_HELP("Efface un certain nombre de messages dans le channel."),
    COMMAND_CLEAR_TITLE("%s messages ont été éffacés."),
    COMMAND_CLEAR_TITLE_USER("%s messages de %s sont en train d'être supprimés"),
    COMMAND_CLEAR_ERROR_NOT_ENOUGH("%s n'est pas un nombre de message correct."),

    COMMAND_USERINFO_HELP("Donne des informations sur un utilisateur."),
    COMMAND_USERINFO_NICK(" (%s)"),

    COMMAND_PING_HELP("Calcul le ping du bot entre l'envoie de la commande et l'envoi de la réponse."),
    COMMAND_PING_AWAIT("Calcul en cours..."),
    COMMAND_PING_PING("Ping: %s ms");

    private String value;
    S(String value) {
        this.value = value;
    }

    public String format(Object... os) {
        return String.format(value, os);
    }

    public String get() {
        return value;
    }
}
