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

import org.dmtf.cim.CIM_DiagnosticResult;
import org.dmtf.cim.CIM_DiagnosticSetting;
import org.dmtf.cim.CIM_DiagnosticTest;
import org.dmtf.cim.CIM_ManagedSystemElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticTestImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticTestImpl#getOtherCharacteristicDescription <em>Other Characteristic Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticTestImpl#getOtherCharacteristicsDescriptions <em>Other Characteristics Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticTestImpl#getIsInUse <em>Is In Use</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticTestImpl#getResourcesUsed <em>Resources Used</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticTestImpl#getTestTypes <em>Test Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticTestImpl#getOtherTestTypesDescriptions <em>Other Test Types Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticTestImpl extends CIM_DiagnosticServiceImpl implements CIM_DiagnosticTest {
	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> characteristics;

	/**
	 * The default value of the '{@link #getOtherCharacteristicDescription() <em>Other Characteristic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacteristicDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CHARACTERISTIC_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCharacteristicDescription() <em>Other Characteristic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacteristicDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherCharacteristicDescription = OTHER_CHARACTERISTIC_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherCharacteristicsDescriptions() <em>Other Characteristics Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacteristicsDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherCharacteristicsDescriptions;

	/**
	 * The default value of the '{@link #getIsInUse() <em>Is In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInUse()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_IN_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsInUse() <em>Is In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInUse()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInUse = IS_IN_USE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourcesUsed() <em>Resources Used</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> resourcesUsed;

	/**
	 * The cached value of the '{@link #getTestTypes() <em>Test Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testTypes;

	/**
	 * The cached value of the '{@link #getOtherTestTypesDescriptions() <em>Other Test Types Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTestTypesDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherTestTypesDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticTest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_TEST__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCharacteristicDescription() {
		return otherCharacteristicDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCharacteristicDescription(String newOtherCharacteristicDescription) {
		String oldOtherCharacteristicDescription = otherCharacteristicDescription;
		otherCharacteristicDescription = newOtherCharacteristicDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTIC_DESCRIPTION, oldOtherCharacteristicDescription, otherCharacteristicDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherCharacteristicsDescriptions() {
		if (otherCharacteristicsDescriptions == null) {
			otherCharacteristicsDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTICS_DESCRIPTIONS);
		}
		return otherCharacteristicsDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsInUse() {
		return isInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsInUse(Boolean newIsInUse) {
		Boolean oldIsInUse = isInUse;
		isInUse = newIsInUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_TEST__IS_IN_USE, oldIsInUse, isInUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getResourcesUsed() {
		if (resourcesUsed == null) {
			resourcesUsed = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_TEST__RESOURCES_USED);
		}
		return resourcesUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getTestTypes() {
		if (testTypes == null) {
			testTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_TEST__TEST_TYPES);
		}
		return testTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherTestTypesDescriptions() {
		if (otherTestTypesDescriptions == null) {
			otherTestTypesDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_TEST_TYPES_DESCRIPTIONS);
		}
		return otherTestTypesDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RunTest(CIM_ManagedSystemElement SystemElement, CIM_DiagnosticSetting Setting, CIM_DiagnosticResult Result) {
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
	public Long ClearResults(CIM_ManagedSystemElement SystemElement, EList<String> ResultsNotCleared) {
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
	public Long DiscontinueTest(CIM_ManagedSystemElement SystemElement, CIM_DiagnosticResult Result, Boolean TestingStopped) {
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
			case CimPackage.CIM_DIAGNOSTIC_TEST__CHARACTERISTICS:
				return getCharacteristics();
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTIC_DESCRIPTION:
				return getOtherCharacteristicDescription();
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTICS_DESCRIPTIONS:
				return getOtherCharacteristicsDescriptions();
			case CimPackage.CIM_DIAGNOSTIC_TEST__IS_IN_USE:
				return getIsInUse();
			case CimPackage.CIM_DIAGNOSTIC_TEST__RESOURCES_USED:
				return getResourcesUsed();
			case CimPackage.CIM_DIAGNOSTIC_TEST__TEST_TYPES:
				return getTestTypes();
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_TEST_TYPES_DESCRIPTIONS:
				return getOtherTestTypesDescriptions();
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
			case CimPackage.CIM_DIAGNOSTIC_TEST__CHARACTERISTICS:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTIC_DESCRIPTION:
				setOtherCharacteristicDescription((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTICS_DESCRIPTIONS:
				getOtherCharacteristicsDescriptions().clear();
				getOtherCharacteristicsDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__IS_IN_USE:
				setIsInUse((Boolean)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__RESOURCES_USED:
				getResourcesUsed().clear();
				getResourcesUsed().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__TEST_TYPES:
				getTestTypes().clear();
				getTestTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_TEST_TYPES_DESCRIPTIONS:
				getOtherTestTypesDescriptions().clear();
				getOtherTestTypesDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_TEST__CHARACTERISTICS:
				getCharacteristics().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTIC_DESCRIPTION:
				setOtherCharacteristicDescription(OTHER_CHARACTERISTIC_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTICS_DESCRIPTIONS:
				getOtherCharacteristicsDescriptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__IS_IN_USE:
				setIsInUse(IS_IN_USE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__RESOURCES_USED:
				getResourcesUsed().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__TEST_TYPES:
				getTestTypes().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_TEST_TYPES_DESCRIPTIONS:
				getOtherTestTypesDescriptions().clear();
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
			case CimPackage.CIM_DIAGNOSTIC_TEST__CHARACTERISTICS:
				return characteristics != null && !characteristics.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTIC_DESCRIPTION:
				return OTHER_CHARACTERISTIC_DESCRIPTION_EDEFAULT == null ? otherCharacteristicDescription != null : !OTHER_CHARACTERISTIC_DESCRIPTION_EDEFAULT.equals(otherCharacteristicDescription);
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_CHARACTERISTICS_DESCRIPTIONS:
				return otherCharacteristicsDescriptions != null && !otherCharacteristicsDescriptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_TEST__IS_IN_USE:
				return IS_IN_USE_EDEFAULT == null ? isInUse != null : !IS_IN_USE_EDEFAULT.equals(isInUse);
			case CimPackage.CIM_DIAGNOSTIC_TEST__RESOURCES_USED:
				return resourcesUsed != null && !resourcesUsed.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_TEST__TEST_TYPES:
				return testTypes != null && !testTypes.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_TEST__OTHER_TEST_TYPES_DESCRIPTIONS:
				return otherTestTypesDescriptions != null && !otherTestTypesDescriptions.isEmpty();
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
			case CimPackage.CIM_DIAGNOSTIC_TEST___RUN_TEST__CIM_MANAGEDSYSTEMELEMENT_CIM_DIAGNOSTICSETTING_CIM_DIAGNOSTICRESULT:
				return RunTest((CIM_ManagedSystemElement)arguments.get(0), (CIM_DiagnosticSetting)arguments.get(1), (CIM_DiagnosticResult)arguments.get(2));
			case CimPackage.CIM_DIAGNOSTIC_TEST___CLEAR_RESULTS__CIM_MANAGEDSYSTEMELEMENT_ELIST:
				return ClearResults((CIM_ManagedSystemElement)arguments.get(0), (EList<String>)arguments.get(1));
			case CimPackage.CIM_DIAGNOSTIC_TEST___DISCONTINUE_TEST__CIM_MANAGEDSYSTEMELEMENT_CIM_DIAGNOSTICRESULT_BOOLEAN:
				return DiscontinueTest((CIM_ManagedSystemElement)arguments.get(0), (CIM_DiagnosticResult)arguments.get(1), (Boolean)arguments.get(2));
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
		result.append(" (Characteristics: ");
		result.append(characteristics);
		result.append(", OtherCharacteristicDescription: ");
		result.append(otherCharacteristicDescription);
		result.append(", OtherCharacteristicsDescriptions: ");
		result.append(otherCharacteristicsDescriptions);
		result.append(", IsInUse: ");
		result.append(isInUse);
		result.append(", ResourcesUsed: ");
		result.append(resourcesUsed);
		result.append(", TestTypes: ");
		result.append(testTypes);
		result.append(", OtherTestTypesDescriptions: ");
		result.append(otherTestTypesDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_DiagnosticTestImpl
