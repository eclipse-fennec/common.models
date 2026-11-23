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

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_RegisteredProfile;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Registered Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RegisteredProfileImpl#getImplementedFeatures <em>Implemented Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RegisteredProfileImpl extends CIM_RegisteredSpecificationImpl implements CIM_RegisteredProfile {
	/**
	 * The cached value of the '{@link #getImplementedFeatures() <em>Implemented Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> implementedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RegisteredProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RegisteredProfile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getImplementedFeatures() {
		if (implementedFeatures == null) {
			implementedFeatures = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_REGISTERED_PROFILE__IMPLEMENTED_FEATURES);
		}
		return implementedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CloseConformantInstances(String EnumerationContext) {
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
	public Long OpenConformantInstances(String ResultClass, EList<String> IncludedPropertyList, Long OperationTimeout, Boolean ContinueOnError, Long MaxObjectCount, String EnumerationContext, Boolean EndOfSequence, EList<Integer> InstanceType, EList<String> InstanceWithPathList) {
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
	public Long PullConformantInstances(Long MaxObjectCount, String EnumerationContext, Boolean EndOfSequence, EList<Integer> InstanceType, EList<String> InstanceWithPathList) {
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
	public Integer GetCentralInstances(EList<CIM_ManagedElement> CentralInstances) {
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
			case CimPackage.CIM_REGISTERED_PROFILE__IMPLEMENTED_FEATURES:
				return getImplementedFeatures();
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
			case CimPackage.CIM_REGISTERED_PROFILE__IMPLEMENTED_FEATURES:
				getImplementedFeatures().clear();
				getImplementedFeatures().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_REGISTERED_PROFILE__IMPLEMENTED_FEATURES:
				getImplementedFeatures().clear();
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
			case CimPackage.CIM_REGISTERED_PROFILE__IMPLEMENTED_FEATURES:
				return implementedFeatures != null && !implementedFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
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
			case CimPackage.CIM_REGISTERED_PROFILE___CLOSE_CONFORMANT_INSTANCES__STRING:
				return CloseConformantInstances((String)arguments.get(0));
			case CimPackage.CIM_REGISTERED_PROFILE___OPEN_CONFORMANT_INSTANCES__STRING_ELIST_LONG_BOOLEAN_LONG_STRING_BOOLEAN_ELIST_ELIST:
				return OpenConformantInstances((String)arguments.get(0), (EList<String>)arguments.get(1), (Long)arguments.get(2), (Boolean)arguments.get(3), (Long)arguments.get(4), (String)arguments.get(5), (Boolean)arguments.get(6), (EList<Integer>)arguments.get(7), (EList<String>)arguments.get(8));
			case CimPackage.CIM_REGISTERED_PROFILE___PULL_CONFORMANT_INSTANCES__LONG_STRING_BOOLEAN_ELIST_ELIST:
				return PullConformantInstances((Long)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2), (EList<Integer>)arguments.get(3), (EList<String>)arguments.get(4));
			case CimPackage.CIM_REGISTERED_PROFILE___GET_CENTRAL_INSTANCES__ELIST:
				return GetCentralInstances((EList<CIM_ManagedElement>)arguments.get(0));
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
		result.append(" (ImplementedFeatures: ");
		result.append(implementedFeatures);
		result.append(')');
		return result.toString();
	}

} //CIM_RegisteredProfileImpl
