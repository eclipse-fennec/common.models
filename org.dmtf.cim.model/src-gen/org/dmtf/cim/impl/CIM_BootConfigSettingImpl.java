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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_BootConfigSetting;
import org.dmtf.cim.CIM_BootSourceSetting;
import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Boot Config Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_BootConfigSettingImpl extends CIM_SettingDataImpl implements CIM_BootConfigSetting {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BootConfigSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BootConfigSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ChangeBootOrder(EList<CIM_BootSourceSetting> Source, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ValidateSettings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_BOOT_CONFIG_SETTING___CHANGE_BOOT_ORDER__ELIST_CIM_CONCRETEJOB:
				return ChangeBootOrder((EList<CIM_BootSourceSetting>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
			case CimPackage.CIM_BOOT_CONFIG_SETTING___VALIDATE_SETTINGS:
				return ValidateSettings();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_BootConfigSettingImpl
