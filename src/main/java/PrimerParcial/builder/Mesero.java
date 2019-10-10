package PrimerParcial.builder;


public class Mesero {
    private ParrillaProductBuilder parrillaProductBuilder;

    public void setProductBuilder(ParrillaProductBuilder parillabuilder) {
        parrillaProductBuilder = parillabuilder;
    }

    public Parrillas getProduct() {
        return parrillaProductBuilder.getParrillas();
    }

    public void buildParrilla() {
        parrillaProductBuilder.createProduct();
        parrillaProductBuilder.buildTipoCarne();
        parrillaProductBuilder.buildRefresco();
        parrillaProductBuilder.buildGuarnicion();
    }
}
