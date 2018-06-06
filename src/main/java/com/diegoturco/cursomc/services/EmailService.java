package com.diegoturco.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.diegoturco.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendMail(SimpleMailMessage msg);
}
