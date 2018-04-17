package com.softjava.test.modelo;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import com.softjava.controllador.PessoaControllador;
import com.softjava.modelo.Pessoa;

public class PessoaTest {
	public static void main(String[] args) {
		WeldContainer weldContainer = new Weld().initialize();
		weldContainer.event().select(ContainerInitialized.class).fire(new ContainerInitialized());
		PessoaControllador playerServiceBean = weldContainer.instance().select(PessoaControllador.class).get();
		Pessoa p = new Pessoa();
		p.setNome("Willian");
		playerServiceBean.createPlayer(p);
	}
}
