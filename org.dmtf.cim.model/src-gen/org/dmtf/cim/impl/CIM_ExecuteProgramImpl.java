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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_ExecuteProgram;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Execute Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExecuteProgramImpl#getProgramPath <em>Program Path</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExecuteProgramImpl#getCommandLine <em>Command Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ExecuteProgramImpl extends CIM_ActionImpl implements CIM_ExecuteProgram {
	/**
	 * The default value of the '{@link #getProgramPath() <em>Program Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramPath() <em>Program Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramPath()
	 * @generated
	 * @ordered
	 */
	protected String programPath = PROGRAM_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommandLine() <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLine()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandLine() <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLine()
	 * @generated
	 * @ordered
	 */
	protected String commandLine = COMMAND_LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ExecuteProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ExecuteProgram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProgramPath() {
		return programPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramPath(String newProgramPath) {
		String oldProgramPath = programPath;
		programPath = newProgramPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXECUTE_PROGRAM__PROGRAM_PATH, oldProgramPath, programPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommandLine() {
		return commandLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommandLine(String newCommandLine) {
		String oldCommandLine = commandLine;
		commandLine = newCommandLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXECUTE_PROGRAM__COMMAND_LINE, oldCommandLine, commandLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_EXECUTE_PROGRAM__PROGRAM_PATH:
				return getProgramPath();
			case CimPackage.CIM_EXECUTE_PROGRAM__COMMAND_LINE:
				return getCommandLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_EXECUTE_PROGRAM__PROGRAM_PATH:
				setProgramPath((String)newValue);
				return;
			case CimPackage.CIM_EXECUTE_PROGRAM__COMMAND_LINE:
				setCommandLine((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_EXECUTE_PROGRAM__PROGRAM_PATH:
				setProgramPath(PROGRAM_PATH_EDEFAULT);
				return;
			case CimPackage.CIM_EXECUTE_PROGRAM__COMMAND_LINE:
				setCommandLine(COMMAND_LINE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_EXECUTE_PROGRAM__PROGRAM_PATH:
				return PROGRAM_PATH_EDEFAULT == null ? programPath != null : !PROGRAM_PATH_EDEFAULT.equals(programPath);
			case CimPackage.CIM_EXECUTE_PROGRAM__COMMAND_LINE:
				return COMMAND_LINE_EDEFAULT == null ? commandLine != null : !COMMAND_LINE_EDEFAULT.equals(commandLine);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ProgramPath: ");
		result.append(programPath);
		result.append(", CommandLine: ");
		result.append(commandLine);
		result.append(')');
		return result.toString();
	}

} //CIM_ExecuteProgramImpl
