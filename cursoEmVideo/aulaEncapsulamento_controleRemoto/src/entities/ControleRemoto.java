package entities;

import interfaces.Controlador;

public class ControleRemoto implements Controlador{

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}
	
	//getters e setters
	public int getVolume(){
		return volume;
	}
	
	public void setVolume(int volume){
		this.volume = volume;
	}
	
	public boolean isLigado(){
		return ligado;
	}
	
	public void setLigado(boolean ligado){
		this.ligado = ligado;
	}
	
	public boolean isTocando(){
		return tocando;
	}
	
	public void setTocando(boolean tocando){
		this.tocando = tocando;
	}
	
	
	//métodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true); 
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("Status TV: " + this.isLigado());
		System.out.println("Status playing: " + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		
		for(int i=0; i<=this.getVolume(); i+=10) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}

	@Override
	public void aumentarVoulume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Impossível aumentar volume");
		}
	}

	@Override
	public void diminuirVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossível diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.isLigado() && !(this.isTocando())){
			this.setTocando(true);
		} else {
			System.out.println("Não é possível reproduzir");
		}
	}

	@Override
	public void pause() {
		if(this.isLigado() && this.isTocando()){
			this.setTocando(false);
		} else {
			System.out.println("Não é possível pausar");
		}
	}
	
}
