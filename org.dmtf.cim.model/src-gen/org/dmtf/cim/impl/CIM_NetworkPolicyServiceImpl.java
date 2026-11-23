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

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_NetworkPolicyRule;
import org.dmtf.cim.CIM_NetworkPolicyService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Policy Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPolicyServiceImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPolicyServiceImpl#getOtherServiceTypeDescription <em>Other Service Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPolicyServiceImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPolicyServiceImpl#getServiceIDType <em>Service ID Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkPolicyServiceImpl extends CIM_ServiceImpl implements CIM_NetworkPolicyService {
	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SERVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected Integer serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherServiceTypeDescription() <em>Other Service Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherServiceTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SERVICE_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherServiceTypeDescription() <em>Other Service Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherServiceTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherServiceTypeDescription = OTHER_SERVICE_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected String serviceID = SERVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceIDType() <em>Service ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIDType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SERVICE_ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceIDType() <em>Service ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIDType()
	 * @generated
	 * @ordered
	 */
	protected Integer serviceIDType = SERVICE_ID_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPolicyServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPolicyService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceType(Integer newServiceType) {
		Integer oldServiceType = serviceType;
		serviceType = newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherServiceTypeDescription() {
		return otherServiceTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherServiceTypeDescription(String newOtherServiceTypeDescription) {
		String oldOtherServiceTypeDescription = otherServiceTypeDescription;
		otherServiceTypeDescription = newOtherServiceTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_POLICY_SERVICE__OTHER_SERVICE_TYPE_DESCRIPTION, oldOtherServiceTypeDescription, otherServiceTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceID() {
		return serviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceID(String newServiceID) {
		String oldServiceID = serviceID;
		serviceID = newServiceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID, oldServiceID, serviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getServiceIDType() {
		return serviceIDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceIDType(Integer newServiceIDType) {
		Integer oldServiceIDType = serviceIDType;
		serviceIDType = newServiceIDType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID_TYPE, oldServiceIDType, serviceIDType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreatePolicyRule(EList<String> NetworkPolicyAction, EList<Integer> ActionsOrder, EList<String> NetworkPolicyCondition, EList<Integer> ConditionGroupNumber, EList<String> NetworkPolicyRuleSettingData, EList<String> NetworkPolicyActionSettingData, CIM_NetworkPolicyRule NetworkPolicyRule) {
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
	public Long DeletePolicyRules(EList<CIM_NetworkPolicyRule> NetworkPolicyRule) {
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
	public Long ApplyPolicyRule(CIM_NetworkPolicyRule NetworkPolicyRule, EList<CIM_ManagedElement> ManagedElememt) {
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
	public Long ReleasePolicyRule(CIM_NetworkPolicyRule NetworkPolicyRule, EList<CIM_ManagedElement> ManagedElement) {
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
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_TYPE:
				return getServiceType();
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__OTHER_SERVICE_TYPE_DESCRIPTION:
				return getOtherServiceTypeDescription();
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID:
				return getServiceID();
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID_TYPE:
				return getServiceIDType();
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
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_TYPE:
				setServiceType((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__OTHER_SERVICE_TYPE_DESCRIPTION:
				setOtherServiceTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID:
				setServiceID((String)newValue);
				return;
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID_TYPE:
				setServiceIDType((Integer)newValue);
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
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_TYPE:
				setServiceType(SERVICE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__OTHER_SERVICE_TYPE_DESCRIPTION:
				setOtherServiceTypeDescription(OTHER_SERVICE_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID:
				setServiceID(SERVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID_TYPE:
				setServiceIDType(SERVICE_ID_TYPE_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_TYPE:
				return SERVICE_TYPE_EDEFAULT == null ? serviceType != null : !SERVICE_TYPE_EDEFAULT.equals(serviceType);
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__OTHER_SERVICE_TYPE_DESCRIPTION:
				return OTHER_SERVICE_TYPE_DESCRIPTION_EDEFAULT == null ? otherServiceTypeDescription != null : !OTHER_SERVICE_TYPE_DESCRIPTION_EDEFAULT.equals(otherServiceTypeDescription);
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID:
				return SERVICE_ID_EDEFAULT == null ? serviceID != null : !SERVICE_ID_EDEFAULT.equals(serviceID);
			case CimPackage.CIM_NETWORK_POLICY_SERVICE__SERVICE_ID_TYPE:
				return SERVICE_ID_TYPE_EDEFAULT == null ? serviceIDType != null : !SERVICE_ID_TYPE_EDEFAULT.equals(serviceIDType);
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
			case CimPackage.CIM_NETWORK_POLICY_SERVICE___CREATE_POLICY_RULE__ELIST_ELIST_ELIST_ELIST_ELIST_ELIST_CIM_NETWORKPOLICYRULE:
				return CreatePolicyRule((EList<String>)arguments.get(0), (EList<Integer>)arguments.get(1), (EList<String>)arguments.get(2), (EList<Integer>)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5), (CIM_NetworkPolicyRule)arguments.get(6));
			case CimPackage.CIM_NETWORK_POLICY_SERVICE___DELETE_POLICY_RULES__ELIST:
				return DeletePolicyRules((EList<CIM_NetworkPolicyRule>)arguments.get(0));
			case CimPackage.CIM_NETWORK_POLICY_SERVICE___APPLY_POLICY_RULE__CIM_NETWORKPOLICYRULE_ELIST:
				return ApplyPolicyRule((CIM_NetworkPolicyRule)arguments.get(0), (EList<CIM_ManagedElement>)arguments.get(1));
			case CimPackage.CIM_NETWORK_POLICY_SERVICE___RELEASE_POLICY_RULE__CIM_NETWORKPOLICYRULE_ELIST:
				return ReleasePolicyRule((CIM_NetworkPolicyRule)arguments.get(0), (EList<CIM_ManagedElement>)arguments.get(1));
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
		result.append(" (ServiceType: ");
		result.append(serviceType);
		result.append(", OtherServiceTypeDescription: ");
		result.append(otherServiceTypeDescription);
		result.append(", ServiceID: ");
		result.append(serviceID);
		result.append(", ServiceIDType: ");
		result.append(serviceIDType);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkPolicyServiceImpl
