public enum TipPredstave {
    DRAMA,OPERA,BALET;

    public static TipPredstave fromStringToPerformanceType(String stringRepresentation) {
        if (stringRepresentation.equals("DRAMA")) {
            return TipPredstave.DRAMA;
        }
        if (stringRepresentation.equals("OPERA")) {
            return TipPredstave.OPERA;
        }
        if (stringRepresentation.equals("BALLET")) {
            return TipPredstave.BALET;
        }
        return null;
    }

}

