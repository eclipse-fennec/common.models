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

import org.dmtf.cim.CIM_EnabledLogicalElementCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Enabled Logical Element Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementCapabilitiesImpl#getElementNameEditSupported <em>Element Name Edit Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementCapabilitiesImpl#getMaxElementNameLen <em>Max Element Name Len</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementCapabilitiesImpl#getRequestedStatesSupported <em>Requested States Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementCapabilitiesImpl#getElementNameMask <em>Element Name Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementCapabilitiesImpl#getStateAwareness <em>State Awareness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_EnabledLogicalElementCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_EnabledLogicalElementCapabilities {
	/**
	 * The default value of the '{@link #getElementNameEditSupported() <em>Element Name Edit Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNameEditSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ELEMENT_NAME_EDIT_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementNameEditSupported() <em>Element Name Edit Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNameEditSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean elementNameEditSupported = ELEMENT_NAME_EDIT_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxElementNameLen() <em>Max Element Name Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElementNameLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_ELEMENT_NAME_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxElementNameLen() <em>Max Element Name Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElementNameLen()
	 * @generated
	 * @ordered
	 */
	protected Integer maxElementNameLen = MAX_ELEMENT_NAME_LEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestedStatesSupported() <em>Requested States Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedStatesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> requestedStatesSupported;

	/**
	 * The default value of the '{@link #getElementNameMask() <em>Element Name Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNameMask()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementNameMask() <em>Element Name Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNameMask()
	 * @generated
	 * @ordered
	 */
	protected String elementNameMask = ELEMENT_NAME_MASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateAwareness() <em>State Awareness</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateAwareness()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> stateAwareness;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EnabledLogicalElementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EnabledLogicalElementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getElementNameEditSupported() {
		return elementNameEditSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementNameEditSupported(Boolean newElementNameEditSupported) {
		Boolean oldElementNameEditSupported = elementNameEditSupported;
		elementNameEditSupported = newElementNameEditSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED, oldElementNameEditSupported, elementNameEditSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxElementNameLen() {
		return maxElementNameLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxElementNameLen(Integer newMaxElementNameLen) {
		Integer oldMaxElementNameLen = maxElementNameLen;
		maxElementNameLen = newMaxElementNameLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN, oldMaxElementNameLen, maxElementNameLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRequestedStatesSupported() {
		if (requestedStatesSupported == null) {
			requestedStatesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__REQUESTED_STATES_SUPPORTED);
		}
		return requestedStatesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementNameMask() {
		return elementNameMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementNameMask(String newElementNameMask) {
		String oldElementNameMask = elementNameMask;
		elementNameMask = newElementNameMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_MASK, oldElementNameMask, elementNameMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getStateAwareness() {
		if (stateAwareness == null) {
			stateAwareness = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__STATE_AWARENESS);
		}
		return stateAwareness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED:
				return getElementNameEditSupported();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN:
				return getMaxElementNameLen();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__REQUESTED_STATES_SUPPORTED:
				return getRequestedStatesSupported();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_MASK:
				return getElementNameMask();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__STATE_AWARENESS:
				return getStateAwareness();
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
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED:
				setElementNameEditSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN:
				setMaxElementNameLen((Integer)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__REQUESTED_STATES_SUPPORTED:
				getRequestedStatesSupported().clear();
				getRequestedStatesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_MASK:
				setElementNameMask((String)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__STATE_AWARENESS:
				getStateAwareness().clear();
				getStateAwareness().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED:
				setElementNameEditSupported(ELEMENT_NAME_EDIT_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN:
				setMaxElementNameLen(MAX_ELEMENT_NAME_LEN_EDEFAULT);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__REQUESTED_STATES_SUPPORTED:
				getRequestedStatesSupported().clear();
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_MASK:
				setElementNameMask(ELEMENT_NAME_MASK_EDEFAULT);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__STATE_AWARENESS:
				getStateAwareness().clear();
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
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED:
				return ELEMENT_NAME_EDIT_SUPPORTED_EDEFAULT == null ? elementNameEditSupported != null : !ELEMENT_NAME_EDIT_SUPPORTED_EDEFAULT.equals(elementNameEditSupported);
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN:
				return MAX_ELEMENT_NAME_LEN_EDEFAULT == null ? maxElementNameLen != null : !MAX_ELEMENT_NAME_LEN_EDEFAULT.equals(maxElementNameLen);
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__REQUESTED_STATES_SUPPORTED:
				return requestedStatesSupported != null && !requestedStatesSupported.isEmpty();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_MASK:
				return ELEMENT_NAME_MASK_EDEFAULT == null ? elementNameMask != null : !ELEMENT_NAME_MASK_EDEFAULT.equals(elementNameMask);
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES__STATE_AWARENESS:
				return stateAwareness != null && !stateAwareness.isEmpty();
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
		result.append(" (ElementNameEditSupported: ");
		result.append(elementNameEditSupported);
		result.append(", MaxElementNameLen: ");
		result.append(maxElementNameLen);
		result.append(", RequestedStatesSupported: ");
		result.append(requestedStatesSupported);
		result.append(", ElementNameMask: ");
		result.append(elementNameMask);
		result.append(", StateAwareness: ");
		result.append(stateAwareness);
		result.append(')');
		return result.toString();
	}

} //CIM_EnabledLogicalElementCapabilitiesImpl
