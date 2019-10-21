package SegundoParcialExamen.Command3;


    public class Atacar implements IAccion {
        private Game game;

        public Atacar(Game game) {
            this.game = game;
        }

        public void execute() {
            this.game.atacar();
        }
}
