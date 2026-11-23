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

import org.dmtf.cim.CIM_ImplementationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Implementation Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ImplementationCapabilitiesImpl#getSupportedCapacityOptimizations <em>Supported Capacity Optimizations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ImplementationCapabilitiesImpl#getSupportedViews <em>Supported Views</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ImplementationCapabilitiesImpl#getSupportedElementNameCodeSet <em>Supported Element Name Code Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ImplementationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_ImplementationCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedCapacityOptimizations() <em>Supported Capacity Optimizations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCapacityOptimizations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedCapacityOptimizations;

	/**
	 * The cached value of the '{@link #getSupportedViews() <em>Supported Views</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedViews()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedViews;

	/**
	 * The default value of the '{@link #getSupportedElementNameCodeSet() <em>Supported Element Name Code Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedElementNameCodeSet()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUPPORTED_ELEMENT_NAME_CODE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportedElementNameCodeSet() <em>Supported Element Name Code Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedElementNameCodeSet()
	 * @generated
	 * @ordered
	 */
	protected Integer supportedElementNameCodeSet = SUPPORTED_ELEMENT_NAME_CODE_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ImplementationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ImplementationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedCapacityOptimizations() {
		if (supportedCapacityOptimizations == null) {
			supportedCapacityOptimizations = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_CAPACITY_OPTIMIZATIONS);
		}
		return supportedCapacityOptimizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedViews() {
		if (supportedViews == null) {
			supportedViews = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_VIEWS);
		}
		return supportedViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSupportedElementNameCodeSet() {
		return supportedElementNameCodeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportedElementNameCodeSet(Integer newSupportedElementNameCodeSet) {
		Integer oldSupportedElementNameCodeSet = supportedElementNameCodeSet;
		supportedElementNameCodeSet = newSupportedElementNameCodeSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_ELEMENT_NAME_CODE_SET, oldSupportedElementNameCodeSet, supportedElementNameCodeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_CAPACITY_OPTIMIZATIONS:
				return getSupportedCapacityOptimizations();
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_VIEWS:
				return getSupportedViews();
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_ELEMENT_NAME_CODE_SET:
				return getSupportedElementNameCodeSet();
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
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_CAPACITY_OPTIMIZATIONS:
				getSupportedCapacityOptimizations().clear();
				getSupportedCapacityOptimizations().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_VIEWS:
				getSupportedViews().clear();
				getSupportedViews().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_ELEMENT_NAME_CODE_SET:
				setSupportedElementNameCodeSet((Integer)newValue);
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
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_CAPACITY_OPTIMIZATIONS:
				getSupportedCapacityOptimizations().clear();
				return;
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_VIEWS:
				getSupportedViews().clear();
				return;
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_ELEMENT_NAME_CODE_SET:
				setSupportedElementNameCodeSet(SUPPORTED_ELEMENT_NAME_CODE_SET_EDEFAULT);
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
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_CAPACITY_OPTIMIZATIONS:
				return supportedCapacityOptimizations != null && !supportedCapacityOptimizations.isEmpty();
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_VIEWS:
				return supportedViews != null && !supportedViews.isEmpty();
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES__SUPPORTED_ELEMENT_NAME_CODE_SET:
				return SUPPORTED_ELEMENT_NAME_CODE_SET_EDEFAULT == null ? supportedElementNameCodeSet != null : !SUPPORTED_ELEMENT_NAME_CODE_SET_EDEFAULT.equals(supportedElementNameCodeSet);
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
		result.append(" (SupportedCapacityOptimizations: ");
		result.append(supportedCapacityOptimizations);
		result.append(", SupportedViews: ");
		result.append(supportedViews);
		result.append(", SupportedElementNameCodeSet: ");
		result.append(supportedElementNameCodeSet);
		result.append(')');
		return result.toString();
	}

} //CIM_ImplementationCapabilitiesImpl
