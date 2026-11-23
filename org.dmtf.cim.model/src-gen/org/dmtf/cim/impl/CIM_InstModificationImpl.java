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

import org.dmtf.cim.CIM_InstModification;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Inst Modification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstModificationImpl#getPreviousInstance <em>Previous Instance</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstModificationImpl#getChangedPropertyNames <em>Changed Property Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_InstModificationImpl extends CIM_InstIndicationImpl implements CIM_InstModification {
	/**
	 * The default value of the '{@link #getPreviousInstance() <em>Previous Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviousInstance() <em>Previous Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousInstance()
	 * @generated
	 * @ordered
	 */
	protected String previousInstance = PREVIOUS_INSTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChangedPropertyNames() <em>Changed Property Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedPropertyNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> changedPropertyNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_InstModificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_InstModification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreviousInstance() {
		return previousInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousInstance(String newPreviousInstance) {
		String oldPreviousInstance = previousInstance;
		previousInstance = newPreviousInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INST_MODIFICATION__PREVIOUS_INSTANCE, oldPreviousInstance, previousInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getChangedPropertyNames() {
		if (changedPropertyNames == null) {
			changedPropertyNames = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_INST_MODIFICATION__CHANGED_PROPERTY_NAMES);
		}
		return changedPropertyNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INST_MODIFICATION__PREVIOUS_INSTANCE:
				return getPreviousInstance();
			case CimPackage.CIM_INST_MODIFICATION__CHANGED_PROPERTY_NAMES:
				return getChangedPropertyNames();
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
			case CimPackage.CIM_INST_MODIFICATION__PREVIOUS_INSTANCE:
				setPreviousInstance((String)newValue);
				return;
			case CimPackage.CIM_INST_MODIFICATION__CHANGED_PROPERTY_NAMES:
				getChangedPropertyNames().clear();
				getChangedPropertyNames().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_INST_MODIFICATION__PREVIOUS_INSTANCE:
				setPreviousInstance(PREVIOUS_INSTANCE_EDEFAULT);
				return;
			case CimPackage.CIM_INST_MODIFICATION__CHANGED_PROPERTY_NAMES:
				getChangedPropertyNames().clear();
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
			case CimPackage.CIM_INST_MODIFICATION__PREVIOUS_INSTANCE:
				return PREVIOUS_INSTANCE_EDEFAULT == null ? previousInstance != null : !PREVIOUS_INSTANCE_EDEFAULT.equals(previousInstance);
			case CimPackage.CIM_INST_MODIFICATION__CHANGED_PROPERTY_NAMES:
				return changedPropertyNames != null && !changedPropertyNames.isEmpty();
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
		result.append(" (PreviousInstance: ");
		result.append(previousInstance);
		result.append(", ChangedPropertyNames: ");
		result.append(changedPropertyNames);
		result.append(')');
		return result.toString();
	}

} //CIM_InstModificationImpl
