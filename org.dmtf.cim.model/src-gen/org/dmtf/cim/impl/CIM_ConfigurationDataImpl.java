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

import java.util.Collection;

import org.dmtf.cim.CIM_ConfigurationData;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Configuration Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationDataImpl#getConfigurationInformation <em>Configuration Information</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationDataImpl#getConfigurationTimestamp <em>Configuration Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ConfigurationDataImpl extends CIM_SettingDataImpl implements CIM_ConfigurationData {
	/**
	 * The cached value of the '{@link #getConfigurationInformation() <em>Configuration Information</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> configurationInformation;

	/**
	 * The default value of the '{@link #getConfigurationTimestamp() <em>Configuration Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationTimestamp() <em>Configuration Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationTimestamp()
	 * @generated
	 * @ordered
	 */
	protected String configurationTimestamp = CONFIGURATION_TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ConfigurationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ConfigurationData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getConfigurationInformation() {
		if (configurationInformation == null) {
			configurationInformation = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_INFORMATION);
		}
		return configurationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationTimestamp() {
		return configurationTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationTimestamp(String newConfigurationTimestamp) {
		String oldConfigurationTimestamp = configurationTimestamp;
		configurationTimestamp = newConfigurationTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_TIMESTAMP, oldConfigurationTimestamp, configurationTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ApplyConfiguration(Boolean ValidateOnly, Integer TypeOfConfiguration, CIM_ManagedElement ManagedElement) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_INFORMATION:
				return getConfigurationInformation();
			case CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_TIMESTAMP:
				return getConfigurationTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_INFORMATION:
				getConfigurationInformation().clear();
				getConfigurationInformation().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_TIMESTAMP:
				setConfigurationTimestamp((String)newValue);
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
			case CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_INFORMATION:
				getConfigurationInformation().clear();
				return;
			case CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_TIMESTAMP:
				setConfigurationTimestamp(CONFIGURATION_TIMESTAMP_EDEFAULT);
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
			case CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_INFORMATION:
				return configurationInformation != null && !configurationInformation.isEmpty();
			case CimPackage.CIM_CONFIGURATION_DATA__CONFIGURATION_TIMESTAMP:
				return CONFIGURATION_TIMESTAMP_EDEFAULT == null ? configurationTimestamp != null : !CONFIGURATION_TIMESTAMP_EDEFAULT.equals(configurationTimestamp);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_CONFIGURATION_DATA___APPLY_CONFIGURATION__BOOLEAN_INTEGER_CIM_MANAGEDELEMENT:
				return ApplyConfiguration((Boolean)arguments.get(0), (Integer)arguments.get(1), (CIM_ManagedElement)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ConfigurationInformation: ");
		result.append(configurationInformation);
		result.append(", ConfigurationTimestamp: ");
		result.append(configurationTimestamp);
		result.append(')');
		return result.toString();
	}

} //CIM_ConfigurationDataImpl
