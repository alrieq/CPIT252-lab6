/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loggerdemo;

/**
 *
 * @author asomy
 */
public abstract class FormatDecorator extends BaseLogger {
	BaseLogger logger;
	// All format decorators have to reimplement the getLabel method
	public abstract String getLabel();
}
