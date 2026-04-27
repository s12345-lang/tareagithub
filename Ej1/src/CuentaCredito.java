
public class CuentaCredito extends Cuenta {

	private static final int CREDITO_DEFAULT = 100;
	private static final int CREDITO_MAXIMO = 300;
	private double credito;

	public CuentaCredito(String titular) {

		super(titular);
		this.credito = CREDITO_DEFAULT;
	}

	public CuentaCredito(String titular, double credito) throws CuentaException {
		super(titular);
		setCredito(credito);
	}

	public CuentaCredito(String titular, double saldo, double credito) throws CuentaException {
		super(saldo, titular);
		setCredito(credito);

	}

	public double getCredito() {
		return credito;
	}

	private void setCredito(double credito) throws CuentaException {
		if (credito > CREDITO_MAXIMO) {
			throw new CuentaException("Error, no se puede superar el credito máximo");
		}
		this.credito = credito;
	}

	public void realizarReintegro(double reintegro) throws CuentaException {
		if (reintegro <= 0) {
			throw new CuentaException("El reintegro solo puede realizarse con cantidades positivas.");
		}
		if (reintegro > (this.saldo + this.credito)) {
			throw new CuentaException("No tienes suficiente saldo.");
		}

		this.saldo = this.saldo - reintegro;
		this.contadorReintegros++;
	}

}
