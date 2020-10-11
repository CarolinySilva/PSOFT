
import java.util.List;

public class Projeto {
	public int dias;
	public boolean isEntregue() {
		return false;
	}
	public List<Cliente> getClientes() {
		return null;
	}

	public String checaPrazo(){
		// verifica o prazo do projeto
		if (this.getDias() < 90) {
			// verifica se o projeto ainda está em andamento
			if (!this.isEntregue()) {
				// projeto com prazo curto para entrega
				return "Projeto está apertado" ;
			} else {
			// projeto já foi entregue
				return "Projeto entregue";}
		} else {
			List<Cliente> clients = this.getClientes();
			for (Cliente c : clients) {
				c.avisaAtraso(this.getDias());
			}
			//projeto em atraso
			return "Projeto atrasado";
		}
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
}



