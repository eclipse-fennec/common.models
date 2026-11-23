/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Execute Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ExecuteProgram causes programs to be executed on the computer system that defines the Action's environment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ExecuteProgram#getProgramPath <em>Program Path</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExecuteProgram#getCommandLine <em>Command Line</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ExecuteProgram()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,ActionID'"
 * @generated
 */
@ProviderType
public interface CIM_ExecuteProgram extends CIM_Action {
	/**
	 * Returns the value of the '<em><b>Program Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location or 'path' where the program is found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Path</em>' attribute.
	 * @see #setProgramPath(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExecuteProgram_ProgramPath()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='1024'"
	 * @generated
	 */
	String getProgramPath();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExecuteProgram#getProgramPath <em>Program Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Path</em>' attribute.
	 * @see #getProgramPath()
	 * @generated
	 */
	void setProgramPath(String value);

	/**
	 * Returns the value of the '<em><b>Command Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that can be executed and invokes program(s), from a system's command line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Line</em>' attribute.
	 * @see #setCommandLine(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ExecuteProgram_CommandLine()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCommandLine();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ExecuteProgram#getCommandLine <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Line</em>' attribute.
	 * @see #getCommandLine()
	 * @generated
	 */
	void setCommandLine(String value);

} // CIM_ExecuteProgram
