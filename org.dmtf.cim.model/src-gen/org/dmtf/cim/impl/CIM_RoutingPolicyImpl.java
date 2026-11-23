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

import org.dmtf.cim.CIM_RoutingPolicy;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Routing Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getAttributeAction <em>Attribute Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getBGPAction <em>BGP Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getBGPValue <em>BGP Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getRemarkAction <em>Remark Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getRemarkValue <em>Remark Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getConditioningAction <em>Conditioning Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getOtherConditioningAction <em>Other Conditioning Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoutingPolicyImpl#getConditioningValue <em>Conditioning Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RoutingPolicyImpl extends CIM_LogicalElementImpl implements CIM_RoutingPolicy {
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
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Integer action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeAction() <em>Attribute Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ATTRIBUTE_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeAction() <em>Attribute Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAction()
	 * @generated
	 * @ordered
	 */
	protected Integer attributeAction = ATTRIBUTE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBGPAction() <em>BGP Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BGP_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBGPAction() <em>BGP Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPAction()
	 * @generated
	 * @ordered
	 */
	protected Integer bgpAction = BGP_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBGPValue() <em>BGP Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPValue()
	 * @generated
	 * @ordered
	 */
	protected static final String BGP_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBGPValue() <em>BGP Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPValue()
	 * @generated
	 * @ordered
	 */
	protected String bgpValue = BGP_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarkAction() <em>Remark Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarkAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMARK_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarkAction() <em>Remark Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarkAction()
	 * @generated
	 * @ordered
	 */
	protected Integer remarkAction = REMARK_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarkValue() <em>Remark Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarkValue()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarkValue() <em>Remark Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarkValue()
	 * @generated
	 * @ordered
	 */
	protected String remarkValue = REMARK_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditioningAction() <em>Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditioningAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONDITIONING_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditioningAction() <em>Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditioningAction()
	 * @generated
	 * @ordered
	 */
	protected Integer conditioningAction = CONDITIONING_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherConditioningAction() <em>Other Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConditioningAction()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CONDITIONING_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherConditioningAction() <em>Other Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConditioningAction()
	 * @generated
	 * @ordered
	 */
	protected String otherConditioningAction = OTHER_CONDITIONING_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditioningValue() <em>Conditioning Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditioningValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditioningValue() <em>Conditioning Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditioningValue()
	 * @generated
	 * @ordered
	 */
	protected String conditioningValue = CONDITIONING_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RoutingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RoutingPolicy();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__SYSTEM_NAME, oldSystemName, systemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(Integer newAction) {
		Integer oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAttributeAction() {
		return attributeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeAction(Integer newAttributeAction) {
		Integer oldAttributeAction = attributeAction;
		attributeAction = newAttributeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__ATTRIBUTE_ACTION, oldAttributeAction, attributeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBGPAction() {
		return bgpAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBGPAction(Integer newBGPAction) {
		Integer oldBGPAction = bgpAction;
		bgpAction = newBGPAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__BGP_ACTION, oldBGPAction, bgpAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBGPValue() {
		return bgpValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBGPValue(String newBGPValue) {
		String oldBGPValue = bgpValue;
		bgpValue = newBGPValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__BGP_VALUE, oldBGPValue, bgpValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemarkAction() {
		return remarkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarkAction(Integer newRemarkAction) {
		Integer oldRemarkAction = remarkAction;
		remarkAction = newRemarkAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__REMARK_ACTION, oldRemarkAction, remarkAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarkValue() {
		return remarkValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarkValue(String newRemarkValue) {
		String oldRemarkValue = remarkValue;
		remarkValue = newRemarkValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__REMARK_VALUE, oldRemarkValue, remarkValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConditioningAction() {
		return conditioningAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditioningAction(Integer newConditioningAction) {
		Integer oldConditioningAction = conditioningAction;
		conditioningAction = newConditioningAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__CONDITIONING_ACTION, oldConditioningAction, conditioningAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherConditioningAction() {
		return otherConditioningAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherConditioningAction(String newOtherConditioningAction) {
		String oldOtherConditioningAction = otherConditioningAction;
		otherConditioningAction = newOtherConditioningAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__OTHER_CONDITIONING_ACTION, oldOtherConditioningAction, otherConditioningAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConditioningValue() {
		return conditioningValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditioningValue(String newConditioningValue) {
		String oldConditioningValue = conditioningValue;
		conditioningValue = newConditioningValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTING_POLICY__CONDITIONING_VALUE, oldConditioningValue, conditioningValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ROUTING_POLICY__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_ROUTING_POLICY__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_ROUTING_POLICY__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_ROUTING_POLICY__ACTION:
				return getAction();
			case CimPackage.CIM_ROUTING_POLICY__ATTRIBUTE_ACTION:
				return getAttributeAction();
			case CimPackage.CIM_ROUTING_POLICY__BGP_ACTION:
				return getBGPAction();
			case CimPackage.CIM_ROUTING_POLICY__BGP_VALUE:
				return getBGPValue();
			case CimPackage.CIM_ROUTING_POLICY__REMARK_ACTION:
				return getRemarkAction();
			case CimPackage.CIM_ROUTING_POLICY__REMARK_VALUE:
				return getRemarkValue();
			case CimPackage.CIM_ROUTING_POLICY__CONDITIONING_ACTION:
				return getConditioningAction();
			case CimPackage.CIM_ROUTING_POLICY__OTHER_CONDITIONING_ACTION:
				return getOtherConditioningAction();
			case CimPackage.CIM_ROUTING_POLICY__CONDITIONING_VALUE:
				return getConditioningValue();
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
			case CimPackage.CIM_ROUTING_POLICY__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__ACTION:
				setAction((Integer)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__ATTRIBUTE_ACTION:
				setAttributeAction((Integer)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__BGP_ACTION:
				setBGPAction((Integer)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__BGP_VALUE:
				setBGPValue((String)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__REMARK_ACTION:
				setRemarkAction((Integer)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__REMARK_VALUE:
				setRemarkValue((String)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__CONDITIONING_ACTION:
				setConditioningAction((Integer)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__OTHER_CONDITIONING_ACTION:
				setOtherConditioningAction((String)newValue);
				return;
			case CimPackage.CIM_ROUTING_POLICY__CONDITIONING_VALUE:
				setConditioningValue((String)newValue);
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
			case CimPackage.CIM_ROUTING_POLICY__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__ATTRIBUTE_ACTION:
				setAttributeAction(ATTRIBUTE_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__BGP_ACTION:
				setBGPAction(BGP_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__BGP_VALUE:
				setBGPValue(BGP_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__REMARK_ACTION:
				setRemarkAction(REMARK_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__REMARK_VALUE:
				setRemarkValue(REMARK_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__CONDITIONING_ACTION:
				setConditioningAction(CONDITIONING_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__OTHER_CONDITIONING_ACTION:
				setOtherConditioningAction(OTHER_CONDITIONING_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTING_POLICY__CONDITIONING_VALUE:
				setConditioningValue(CONDITIONING_VALUE_EDEFAULT);
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
			case CimPackage.CIM_ROUTING_POLICY__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_ROUTING_POLICY__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_ROUTING_POLICY__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_ROUTING_POLICY__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case CimPackage.CIM_ROUTING_POLICY__ATTRIBUTE_ACTION:
				return ATTRIBUTE_ACTION_EDEFAULT == null ? attributeAction != null : !ATTRIBUTE_ACTION_EDEFAULT.equals(attributeAction);
			case CimPackage.CIM_ROUTING_POLICY__BGP_ACTION:
				return BGP_ACTION_EDEFAULT == null ? bgpAction != null : !BGP_ACTION_EDEFAULT.equals(bgpAction);
			case CimPackage.CIM_ROUTING_POLICY__BGP_VALUE:
				return BGP_VALUE_EDEFAULT == null ? bgpValue != null : !BGP_VALUE_EDEFAULT.equals(bgpValue);
			case CimPackage.CIM_ROUTING_POLICY__REMARK_ACTION:
				return REMARK_ACTION_EDEFAULT == null ? remarkAction != null : !REMARK_ACTION_EDEFAULT.equals(remarkAction);
			case CimPackage.CIM_ROUTING_POLICY__REMARK_VALUE:
				return REMARK_VALUE_EDEFAULT == null ? remarkValue != null : !REMARK_VALUE_EDEFAULT.equals(remarkValue);
			case CimPackage.CIM_ROUTING_POLICY__CONDITIONING_ACTION:
				return CONDITIONING_ACTION_EDEFAULT == null ? conditioningAction != null : !CONDITIONING_ACTION_EDEFAULT.equals(conditioningAction);
			case CimPackage.CIM_ROUTING_POLICY__OTHER_CONDITIONING_ACTION:
				return OTHER_CONDITIONING_ACTION_EDEFAULT == null ? otherConditioningAction != null : !OTHER_CONDITIONING_ACTION_EDEFAULT.equals(otherConditioningAction);
			case CimPackage.CIM_ROUTING_POLICY__CONDITIONING_VALUE:
				return CONDITIONING_VALUE_EDEFAULT == null ? conditioningValue != null : !CONDITIONING_VALUE_EDEFAULT.equals(conditioningValue);
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
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", Action: ");
		result.append(action);
		result.append(", AttributeAction: ");
		result.append(attributeAction);
		result.append(", BGPAction: ");
		result.append(bgpAction);
		result.append(", BGPValue: ");
		result.append(bgpValue);
		result.append(", RemarkAction: ");
		result.append(remarkAction);
		result.append(", RemarkValue: ");
		result.append(remarkValue);
		result.append(", ConditioningAction: ");
		result.append(conditioningAction);
		result.append(", OtherConditioningAction: ");
		result.append(otherConditioningAction);
		result.append(", ConditioningValue: ");
		result.append(conditioningValue);
		result.append(')');
		return result.toString();
	}

} //CIM_RoutingPolicyImpl
