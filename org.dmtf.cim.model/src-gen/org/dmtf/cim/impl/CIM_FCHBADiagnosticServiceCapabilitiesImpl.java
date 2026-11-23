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

import org.dmtf.cim.CIM_FCHBADiagnosticServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FCHBA Diagnostic Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticServiceCapabilitiesImpl#getBufferSizesSupported <em>Buffer Sizes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticServiceCapabilitiesImpl#getMaxPatternSizeSupported <em>Max Pattern Size Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCHBADiagnosticServiceCapabilitiesImpl extends CIM_DiagnosticServiceCapabilitiesImpl implements CIM_FCHBADiagnosticServiceCapabilities {
	/**
	 * The cached value of the '{@link #getBufferSizesSupported() <em>Buffer Sizes Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSizesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> bufferSizesSupported;

	/**
	 * The default value of the '{@link #getMaxPatternSizeSupported() <em>Max Pattern Size Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPatternSizeSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_PATTERN_SIZE_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPatternSizeSupported() <em>Max Pattern Size Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPatternSizeSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer maxPatternSizeSupported = MAX_PATTERN_SIZE_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCHBADiagnosticServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCHBADiagnosticServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getBufferSizesSupported() {
		if (bufferSizesSupported == null) {
			bufferSizesSupported = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__BUFFER_SIZES_SUPPORTED);
		}
		return bufferSizesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxPatternSizeSupported() {
		return maxPatternSizeSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPatternSizeSupported(Integer newMaxPatternSizeSupported) {
		Integer oldMaxPatternSizeSupported = maxPatternSizeSupported;
		maxPatternSizeSupported = newMaxPatternSizeSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__MAX_PATTERN_SIZE_SUPPORTED, oldMaxPatternSizeSupported, maxPatternSizeSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__BUFFER_SIZES_SUPPORTED:
				return getBufferSizesSupported();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__MAX_PATTERN_SIZE_SUPPORTED:
				return getMaxPatternSizeSupported();
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
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__BUFFER_SIZES_SUPPORTED:
				getBufferSizesSupported().clear();
				getBufferSizesSupported().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__MAX_PATTERN_SIZE_SUPPORTED:
				setMaxPatternSizeSupported((Integer)newValue);
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
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__BUFFER_SIZES_SUPPORTED:
				getBufferSizesSupported().clear();
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__MAX_PATTERN_SIZE_SUPPORTED:
				setMaxPatternSizeSupported(MAX_PATTERN_SIZE_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__BUFFER_SIZES_SUPPORTED:
				return bufferSizesSupported != null && !bufferSizesSupported.isEmpty();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES__MAX_PATTERN_SIZE_SUPPORTED:
				return MAX_PATTERN_SIZE_SUPPORTED_EDEFAULT == null ? maxPatternSizeSupported != null : !MAX_PATTERN_SIZE_SUPPORTED_EDEFAULT.equals(maxPatternSizeSupported);
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
		result.append(" (BufferSizesSupported: ");
		result.append(bufferSizesSupported);
		result.append(", MaxPatternSizeSupported: ");
		result.append(maxPatternSizeSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_FCHBADiagnosticServiceCapabilitiesImpl
