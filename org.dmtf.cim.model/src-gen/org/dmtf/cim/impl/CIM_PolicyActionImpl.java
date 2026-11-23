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

import org.dmtf.cim.CIM_PolicyAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Policy Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyActionImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyActionImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyActionImpl#getPolicyRuleCreationClassName <em>Policy Rule Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyActionImpl#getPolicyRuleName <em>Policy Rule Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyActionImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyActionImpl#getPolicyActionName <em>Policy Action Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyActionImpl#getDoActionLogging <em>Do Action Logging</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_PolicyActionImpl extends CIM_PolicyImpl implements CIM_PolicyAction {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyRuleCreationClassName() <em>Policy Rule Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRuleCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_RULE_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyRuleCreationClassName() <em>Policy Rule Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRuleCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String policyRuleCreationClassName = POLICY_RULE_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyRuleName() <em>Policy Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_RULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyRuleName() <em>Policy Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRuleName()
	 * @generated
	 * @ordered
	 */
	protected String policyRuleName = POLICY_RULE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyActionName() <em>Policy Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyActionName()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ACTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyActionName() <em>Policy Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyActionName()
	 * @generated
	 * @ordered
	 */
	protected String policyActionName = POLICY_ACTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoActionLogging() <em>Do Action Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActionLogging()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DO_ACTION_LOGGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoActionLogging() <em>Do Action Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActionLogging()
	 * @generated
	 * @ordered
	 */
	protected Boolean doActionLogging = DO_ACTION_LOGGING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PolicyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PolicyAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_ACTION__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_ACTION__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyRuleCreationClassName() {
		return policyRuleCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyRuleCreationClassName(String newPolicyRuleCreationClassName) {
		String oldPolicyRuleCreationClassName = policyRuleCreationClassName;
		policyRuleCreationClassName = newPolicyRuleCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_ACTION__POLICY_RULE_CREATION_CLASS_NAME, oldPolicyRuleCreationClassName, policyRuleCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyRuleName() {
		return policyRuleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyRuleName(String newPolicyRuleName) {
		String oldPolicyRuleName = policyRuleName;
		policyRuleName = newPolicyRuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_ACTION__POLICY_RULE_NAME, oldPolicyRuleName, policyRuleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_ACTION__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyActionName() {
		return policyActionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyActionName(String newPolicyActionName) {
		String oldPolicyActionName = policyActionName;
		policyActionName = newPolicyActionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_ACTION__POLICY_ACTION_NAME, oldPolicyActionName, policyActionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDoActionLogging() {
		return doActionLogging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoActionLogging(Boolean newDoActionLogging) {
		Boolean oldDoActionLogging = doActionLogging;
		doActionLogging = newDoActionLogging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_ACTION__DO_ACTION_LOGGING, oldDoActionLogging, doActionLogging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POLICY_ACTION__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_POLICY_ACTION__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_POLICY_ACTION__POLICY_RULE_CREATION_CLASS_NAME:
				return getPolicyRuleCreationClassName();
			case CimPackage.CIM_POLICY_ACTION__POLICY_RULE_NAME:
				return getPolicyRuleName();
			case CimPackage.CIM_POLICY_ACTION__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_POLICY_ACTION__POLICY_ACTION_NAME:
				return getPolicyActionName();
			case CimPackage.CIM_POLICY_ACTION__DO_ACTION_LOGGING:
				return getDoActionLogging();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_POLICY_ACTION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_ACTION__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_ACTION__POLICY_RULE_CREATION_CLASS_NAME:
				setPolicyRuleCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_ACTION__POLICY_RULE_NAME:
				setPolicyRuleName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_ACTION__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_ACTION__POLICY_ACTION_NAME:
				setPolicyActionName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_ACTION__DO_ACTION_LOGGING:
				setDoActionLogging((Boolean)newValue);
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
			case CimPackage.CIM_POLICY_ACTION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_ACTION__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_ACTION__POLICY_RULE_CREATION_CLASS_NAME:
				setPolicyRuleCreationClassName(POLICY_RULE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_ACTION__POLICY_RULE_NAME:
				setPolicyRuleName(POLICY_RULE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_ACTION__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_ACTION__POLICY_ACTION_NAME:
				setPolicyActionName(POLICY_ACTION_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_ACTION__DO_ACTION_LOGGING:
				setDoActionLogging(DO_ACTION_LOGGING_EDEFAULT);
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
			case CimPackage.CIM_POLICY_ACTION__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_POLICY_ACTION__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_POLICY_ACTION__POLICY_RULE_CREATION_CLASS_NAME:
				return POLICY_RULE_CREATION_CLASS_NAME_EDEFAULT == null ? policyRuleCreationClassName != null : !POLICY_RULE_CREATION_CLASS_NAME_EDEFAULT.equals(policyRuleCreationClassName);
			case CimPackage.CIM_POLICY_ACTION__POLICY_RULE_NAME:
				return POLICY_RULE_NAME_EDEFAULT == null ? policyRuleName != null : !POLICY_RULE_NAME_EDEFAULT.equals(policyRuleName);
			case CimPackage.CIM_POLICY_ACTION__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_POLICY_ACTION__POLICY_ACTION_NAME:
				return POLICY_ACTION_NAME_EDEFAULT == null ? policyActionName != null : !POLICY_ACTION_NAME_EDEFAULT.equals(policyActionName);
			case CimPackage.CIM_POLICY_ACTION__DO_ACTION_LOGGING:
				return DO_ACTION_LOGGING_EDEFAULT == null ? doActionLogging != null : !DO_ACTION_LOGGING_EDEFAULT.equals(doActionLogging);
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", PolicyRuleCreationClassName: ");
		result.append(policyRuleCreationClassName);
		result.append(", PolicyRuleName: ");
		result.append(policyRuleName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", PolicyActionName: ");
		result.append(policyActionName);
		result.append(", DoActionLogging: ");
		result.append(doActionLogging);
		result.append(')');
		return result.toString();
	}

} //CIM_PolicyActionImpl
