package client;

import lib.AbstractUIElementFactory;
import lib.ElementWriter;
import lib.UIElement;

public class HTMLElementFactory extends AbstractUIElementFactory {
	
	@Override
	public UIElement create(String type) {
		switch (type) {
		case "h1":
			return new HTMLElement("h1");
		case "h2":
			return new HTMLElement("h2");
		case "h3":
			return new HTMLElement("h3");
		case "button":
			return new HTMLElement("button");
		}
		return null;
	}

	@Override
	public String[] getSupportedElements() {
		return new String[] { "h1", "h2", "h3", "button"};
	}

	@Override
	public ElementWriter getWriter() {
		return new HTMLWriter();
	}

}
