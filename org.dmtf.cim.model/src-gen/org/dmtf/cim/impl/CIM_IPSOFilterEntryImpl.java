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

import org.dmtf.cim.CIM_IPSOFilterEntry;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IPSO Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPSOFilterEntryImpl#getMatchConditionType <em>Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPSOFilterEntryImpl#getClassificationLevel <em>Classification Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPSOFilterEntryImpl#getOtherClassificationLevel <em>Other Classification Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPSOFilterEntryImpl#getProtectionAuthorities <em>Protection Authorities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPSOFilterEntryImpl#getOtherProtectionAuthorities <em>Other Protection Authorities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPSOFilterEntryImpl extends CIM_FilterEntryBaseImpl implements CIM_IPSOFilterEntry {
	/**
	 * The default value of the '{@link #getMatchConditionType() <em>Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MATCH_CONDITION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchConditionType() <em>Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected Integer matchConditionType = MATCH_CONDITION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassificationLevel() <em>Classification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLASSIFICATION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassificationLevel() <em>Classification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationLevel()
	 * @generated
	 * @ordered
	 */
	protected Integer classificationLevel = CLASSIFICATION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherClassificationLevel() <em>Other Classification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherClassificationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CLASSIFICATION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherClassificationLevel() <em>Other Classification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherClassificationLevel()
	 * @generated
	 * @ordered
	 */
	protected String otherClassificationLevel = OTHER_CLASSIFICATION_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtectionAuthorities() <em>Protection Authorities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionAuthorities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> protectionAuthorities;

	/**
	 * The cached value of the '{@link #getOtherProtectionAuthorities() <em>Other Protection Authorities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtectionAuthorities()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherProtectionAuthorities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPSOFilterEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPSOFilterEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMatchConditionType() {
		return matchConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchConditionType(Integer newMatchConditionType) {
		Integer oldMatchConditionType = matchConditionType;
		matchConditionType = newMatchConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSO_FILTER_ENTRY__MATCH_CONDITION_TYPE, oldMatchConditionType, matchConditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getClassificationLevel() {
		return classificationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassificationLevel(Integer newClassificationLevel) {
		Integer oldClassificationLevel = classificationLevel;
		classificationLevel = newClassificationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSO_FILTER_ENTRY__CLASSIFICATION_LEVEL, oldClassificationLevel, classificationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherClassificationLevel() {
		return otherClassificationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherClassificationLevel(String newOtherClassificationLevel) {
		String oldOtherClassificationLevel = otherClassificationLevel;
		otherClassificationLevel = newOtherClassificationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_CLASSIFICATION_LEVEL, oldOtherClassificationLevel, otherClassificationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getProtectionAuthorities() {
		if (protectionAuthorities == null) {
			protectionAuthorities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IPSO_FILTER_ENTRY__PROTECTION_AUTHORITIES);
		}
		return protectionAuthorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherProtectionAuthorities() {
		if (otherProtectionAuthorities == null) {
			otherProtectionAuthorities = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_PROTECTION_AUTHORITIES);
		}
		return otherProtectionAuthorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IPSO_FILTER_ENTRY__MATCH_CONDITION_TYPE:
				return getMatchConditionType();
			case CimPackage.CIM_IPSO_FILTER_ENTRY__CLASSIFICATION_LEVEL:
				return getClassificationLevel();
			case CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_CLASSIFICATION_LEVEL:
				return getOtherClassificationLevel();
			case CimPackage.CIM_IPSO_FILTER_ENTRY__PROTECTION_AUTHORITIES:
				return getProtectionAuthorities();
			case CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_PROTECTION_AUTHORITIES:
				return getOtherProtectionAuthorities();
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
			case CimPackage.CIM_IPSO_FILTER_ENTRY__MATCH_CONDITION_TYPE:
				setMatchConditionType((Integer)newValue);
				return;
			case CimPackage.CIM_IPSO_FILTER_ENTRY__CLASSIFICATION_LEVEL:
				setClassificationLevel((Integer)newValue);
				return;
			case CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_CLASSIFICATION_LEVEL:
				setOtherClassificationLevel((String)newValue);
				return;
			case CimPackage.CIM_IPSO_FILTER_ENTRY__PROTECTION_AUTHORITIES:
				getProtectionAuthorities().clear();
				getProtectionAuthorities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_PROTECTION_AUTHORITIES:
				getOtherProtectionAuthorities().clear();
				getOtherProtectionAuthorities().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_IPSO_FILTER_ENTRY__MATCH_CONDITION_TYPE:
				setMatchConditionType(MATCH_CONDITION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_IPSO_FILTER_ENTRY__CLASSIFICATION_LEVEL:
				setClassificationLevel(CLASSIFICATION_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_CLASSIFICATION_LEVEL:
				setOtherClassificationLevel(OTHER_CLASSIFICATION_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_IPSO_FILTER_ENTRY__PROTECTION_AUTHORITIES:
				getProtectionAuthorities().clear();
				return;
			case CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_PROTECTION_AUTHORITIES:
				getOtherProtectionAuthorities().clear();
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
			case CimPackage.CIM_IPSO_FILTER_ENTRY__MATCH_CONDITION_TYPE:
				return MATCH_CONDITION_TYPE_EDEFAULT == null ? matchConditionType != null : !MATCH_CONDITION_TYPE_EDEFAULT.equals(matchConditionType);
			case CimPackage.CIM_IPSO_FILTER_ENTRY__CLASSIFICATION_LEVEL:
				return CLASSIFICATION_LEVEL_EDEFAULT == null ? classificationLevel != null : !CLASSIFICATION_LEVEL_EDEFAULT.equals(classificationLevel);
			case CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_CLASSIFICATION_LEVEL:
				return OTHER_CLASSIFICATION_LEVEL_EDEFAULT == null ? otherClassificationLevel != null : !OTHER_CLASSIFICATION_LEVEL_EDEFAULT.equals(otherClassificationLevel);
			case CimPackage.CIM_IPSO_FILTER_ENTRY__PROTECTION_AUTHORITIES:
				return protectionAuthorities != null && !protectionAuthorities.isEmpty();
			case CimPackage.CIM_IPSO_FILTER_ENTRY__OTHER_PROTECTION_AUTHORITIES:
				return otherProtectionAuthorities != null && !otherProtectionAuthorities.isEmpty();
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
		result.append(" (MatchConditionType: ");
		result.append(matchConditionType);
		result.append(", ClassificationLevel: ");
		result.append(classificationLevel);
		result.append(", OtherClassificationLevel: ");
		result.append(otherClassificationLevel);
		result.append(", ProtectionAuthorities: ");
		result.append(protectionAuthorities);
		result.append(", OtherProtectionAuthorities: ");
		result.append(otherProtectionAuthorities);
		result.append(')');
		return result.toString();
	}

} //CIM_IPSOFilterEntryImpl
