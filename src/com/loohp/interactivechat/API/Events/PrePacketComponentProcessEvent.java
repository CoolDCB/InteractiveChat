package com.loohp.interactivechat.API.Events;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class PrePacketComponentProcessEvent extends Event {
	
	//This Event is called after the plugin had determinded the chat component in the packet need modifying
	//And before the plugin actually modifies the components
	//Sender will be null if the message is not send by a player or the plugin is unable to find the sender of the message
	//Field is the field number in which the component is obtained from the chat packet, either 0 or 1

	Player reciever;
    WrappedChatComponent component;
    int field;
    UUID sender;

    public PrePacketComponentProcessEvent(Player reciever, WrappedChatComponent component, int field, UUID sender) {
        this.reciever = reciever;
        this.component = component;
        this.field = field;
        this.sender = sender;
    }
    
    public Player getReciver() {
    	return reciever;
    }
    
    public UUID getSender() {
    	return sender;
    }
    
    public void setSender(UUID sender) {
    	this.sender = sender;
    }
    
    public WrappedChatComponent getChatComponent() {
    	return component;
    }
    
    public void setChatComponent(WrappedChatComponent component) {
    	this.component = component;
    }
    
    public int getField() {
    	return field;
    }
    
    @Deprecated
    public void setField(int field) {
    	this.field = field;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
