/*
	Copyright Jim Brain and Brain Innovations, 2007.

	This file is part of tcpser4j.

	tcpser4j is free software; you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation; either version 2 of the License, or
	(at your option) any later version.

	tcpser4j is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with tcpser4j; if not, write to the Free Software
	Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

	@author Jim Brain
	Created on Feb 10, 2007
	
 */
package org.jbrain.net.nvt;

import org.jbrain.net.nvt.options.NVTOption;


public interface OptionEventHandler {
	public NVTOption newSubOption(byte code, byte[] data);
	public void doReceived(OptionEvent event); 	// DO
	public void dontReceived(OptionEvent event); 	// DONT
	public void willReceived(OptionEvent event); //WILL
	public void wontReceived(OptionEvent event);		//WONT
	public void optionDataReceived(OptionEvent event);	// SB
}
