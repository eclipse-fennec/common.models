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

import java.util.Collection;

import org.dmtf.cim.CIM_SpareConfigurationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Spare Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpareConfigurationCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpareConfigurationCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpareConfigurationCapabilitiesImpl#getSystemConfiguredSpares <em>System Configured Spares</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpareConfigurationCapabilitiesImpl#getAutomaticFailOver <em>Automatic Fail Over</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpareConfigurationCapabilitiesImpl#getMaximumSpareStorageExtents <em>Maximum Spare Storage Extents</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpareConfigurationCapabilitiesImpl#getSupportedStorageElementCheck <em>Supported Storage Element Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SpareConfigurationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_SpareConfigurationCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedAsynchronousActions() <em>Supported Asynchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousActions() <em>Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousActions;

	/**
	 * The default value of the '{@link #getSystemConfiguredSpares() <em>System Configured Spares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemConfiguredSpares()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYSTEM_CONFIGURED_SPARES_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSystemConfiguredSpares() <em>System Configured Spares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemConfiguredSpares()
	 * @generated
	 * @ordered
	 */
	protected Boolean systemConfiguredSpares = SYSTEM_CONFIGURED_SPARES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticFailOver() <em>Automatic Fail Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFailOver()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTOMATIC_FAIL_OVER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAutomaticFailOver() <em>Automatic Fail Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFailOver()
	 * @generated
	 * @ordered
	 */
	protected Boolean automaticFailOver = AUTOMATIC_FAIL_OVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumSpareStorageExtents() <em>Maximum Spare Storage Extents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSpareStorageExtents()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_SPARE_STORAGE_EXTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSpareStorageExtents() <em>Maximum Spare Storage Extents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSpareStorageExtents()
	 * @generated
	 * @ordered
	 */
	protected Long maximumSpareStorageExtents = MAXIMUM_SPARE_STORAGE_EXTENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedStorageElementCheck() <em>Supported Storage Element Check</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageElementCheck()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageElementCheck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SpareConfigurationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SpareConfigurationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
		}
		return supportedAsynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousActions() {
		if (supportedSynchronousActions == null) {
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSystemConfiguredSpares() {
		return systemConfiguredSpares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemConfiguredSpares(Boolean newSystemConfiguredSpares) {
		Boolean oldSystemConfiguredSpares = systemConfiguredSpares;
		systemConfiguredSpares = newSystemConfiguredSpares;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SYSTEM_CONFIGURED_SPARES, oldSystemConfiguredSpares, systemConfiguredSpares));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutomaticFailOver() {
		return automaticFailOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticFailOver(Boolean newAutomaticFailOver) {
		Boolean oldAutomaticFailOver = automaticFailOver;
		automaticFailOver = newAutomaticFailOver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__AUTOMATIC_FAIL_OVER, oldAutomaticFailOver, automaticFailOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumSpareStorageExtents() {
		return maximumSpareStorageExtents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumSpareStorageExtents(Long newMaximumSpareStorageExtents) {
		Long oldMaximumSpareStorageExtents = maximumSpareStorageExtents;
		maximumSpareStorageExtents = newMaximumSpareStorageExtents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__MAXIMUM_SPARE_STORAGE_EXTENTS, oldMaximumSpareStorageExtents, maximumSpareStorageExtents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageElementCheck() {
		if (supportedStorageElementCheck == null) {
			supportedStorageElementCheck = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_CHECK);
		}
		return supportedStorageElementCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SYSTEM_CONFIGURED_SPARES:
				return getSystemConfiguredSpares();
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__AUTOMATIC_FAIL_OVER:
				return getAutomaticFailOver();
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__MAXIMUM_SPARE_STORAGE_EXTENTS:
				return getMaximumSpareStorageExtents();
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_CHECK:
				return getSupportedStorageElementCheck();
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
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SYSTEM_CONFIGURED_SPARES:
				setSystemConfiguredSpares((Boolean)newValue);
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__AUTOMATIC_FAIL_OVER:
				setAutomaticFailOver((Boolean)newValue);
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__MAXIMUM_SPARE_STORAGE_EXTENTS:
				setMaximumSpareStorageExtents((Long)newValue);
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_CHECK:
				getSupportedStorageElementCheck().clear();
				getSupportedStorageElementCheck().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SYSTEM_CONFIGURED_SPARES:
				setSystemConfiguredSpares(SYSTEM_CONFIGURED_SPARES_EDEFAULT);
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__AUTOMATIC_FAIL_OVER:
				setAutomaticFailOver(AUTOMATIC_FAIL_OVER_EDEFAULT);
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__MAXIMUM_SPARE_STORAGE_EXTENTS:
				setMaximumSpareStorageExtents(MAXIMUM_SPARE_STORAGE_EXTENTS_EDEFAULT);
				return;
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_CHECK:
				getSupportedStorageElementCheck().clear();
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
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SYSTEM_CONFIGURED_SPARES:
				return SYSTEM_CONFIGURED_SPARES_EDEFAULT == null ? systemConfiguredSpares != null : !SYSTEM_CONFIGURED_SPARES_EDEFAULT.equals(systemConfiguredSpares);
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__AUTOMATIC_FAIL_OVER:
				return AUTOMATIC_FAIL_OVER_EDEFAULT == null ? automaticFailOver != null : !AUTOMATIC_FAIL_OVER_EDEFAULT.equals(automaticFailOver);
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__MAXIMUM_SPARE_STORAGE_EXTENTS:
				return MAXIMUM_SPARE_STORAGE_EXTENTS_EDEFAULT == null ? maximumSpareStorageExtents != null : !MAXIMUM_SPARE_STORAGE_EXTENTS_EDEFAULT.equals(maximumSpareStorageExtents);
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_CHECK:
				return supportedStorageElementCheck != null && !supportedStorageElementCheck.isEmpty();
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
		result.append(" (SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(", SystemConfiguredSpares: ");
		result.append(systemConfiguredSpares);
		result.append(", AutomaticFailOver: ");
		result.append(automaticFailOver);
		result.append(", MaximumSpareStorageExtents: ");
		result.append(maximumSpareStorageExtents);
		result.append(", SupportedStorageElementCheck: ");
		result.append(supportedStorageElementCheck);
		result.append(')');
		return result.toString();
	}

} //CIM_SpareConfigurationCapabilitiesImpl
