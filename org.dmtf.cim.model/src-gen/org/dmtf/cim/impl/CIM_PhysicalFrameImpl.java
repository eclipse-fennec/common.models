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

import org.dmtf.cim.CIM_PhysicalFrame;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalFrameImpl#getCableManagementStrategy <em>Cable Management Strategy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalFrameImpl#getServicePhilosophy <em>Service Philosophy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalFrameImpl#getServiceDescriptions <em>Service Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalFrameImpl#getLockPresent <em>Lock Present</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalFrameImpl#getAudibleAlarm <em>Audible Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalFrameImpl#getVisibleAlarm <em>Visible Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalFrameImpl#getSecurityBreach <em>Security Breach</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalFrameImpl#getBreachDescription <em>Breach Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalFrameImpl#getIsLocked <em>Is Locked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalFrameImpl extends CIM_PhysicalPackageImpl implements CIM_PhysicalFrame {
	/**
	 * The default value of the '{@link #getCableManagementStrategy() <em>Cable Management Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCableManagementStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String CABLE_MANAGEMENT_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCableManagementStrategy() <em>Cable Management Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCableManagementStrategy()
	 * @generated
	 * @ordered
	 */
	protected String cableManagementStrategy = CABLE_MANAGEMENT_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServicePhilosophy() <em>Service Philosophy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePhilosophy()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> servicePhilosophy;

	/**
	 * The cached value of the '{@link #getServiceDescriptions() <em>Service Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceDescriptions;

	/**
	 * The default value of the '{@link #getLockPresent() <em>Lock Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPresent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOCK_PRESENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLockPresent() <em>Lock Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPresent()
	 * @generated
	 * @ordered
	 */
	protected Boolean lockPresent = LOCK_PRESENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudibleAlarm() <em>Audible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudibleAlarm()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUDIBLE_ALARM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudibleAlarm() <em>Audible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudibleAlarm()
	 * @generated
	 * @ordered
	 */
	protected Boolean audibleAlarm = AUDIBLE_ALARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleAlarm() <em>Visible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAlarm()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VISIBLE_ALARM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleAlarm() <em>Visible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAlarm()
	 * @generated
	 * @ordered
	 */
	protected Boolean visibleAlarm = VISIBLE_ALARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityBreach() <em>Security Breach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityBreach()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECURITY_BREACH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityBreach() <em>Security Breach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityBreach()
	 * @generated
	 * @ordered
	 */
	protected Integer securityBreach = SECURITY_BREACH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBreachDescription() <em>Breach Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreachDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String BREACH_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBreachDescription() <em>Breach Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreachDescription()
	 * @generated
	 * @ordered
	 */
	protected String breachDescription = BREACH_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLocked = IS_LOCKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalFrame();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCableManagementStrategy() {
		return cableManagementStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCableManagementStrategy(String newCableManagementStrategy) {
		String oldCableManagementStrategy = cableManagementStrategy;
		cableManagementStrategy = newCableManagementStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_FRAME__CABLE_MANAGEMENT_STRATEGY, oldCableManagementStrategy, cableManagementStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getServicePhilosophy() {
		if (servicePhilosophy == null) {
			servicePhilosophy = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_FRAME__SERVICE_PHILOSOPHY);
		}
		return servicePhilosophy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getServiceDescriptions() {
		if (serviceDescriptions == null) {
			serviceDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_FRAME__SERVICE_DESCRIPTIONS);
		}
		return serviceDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLockPresent() {
		return lockPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockPresent(Boolean newLockPresent) {
		Boolean oldLockPresent = lockPresent;
		lockPresent = newLockPresent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_FRAME__LOCK_PRESENT, oldLockPresent, lockPresent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAudibleAlarm() {
		return audibleAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudibleAlarm(Boolean newAudibleAlarm) {
		Boolean oldAudibleAlarm = audibleAlarm;
		audibleAlarm = newAudibleAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_FRAME__AUDIBLE_ALARM, oldAudibleAlarm, audibleAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getVisibleAlarm() {
		return visibleAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibleAlarm(Boolean newVisibleAlarm) {
		Boolean oldVisibleAlarm = visibleAlarm;
		visibleAlarm = newVisibleAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_FRAME__VISIBLE_ALARM, oldVisibleAlarm, visibleAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecurityBreach() {
		return securityBreach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityBreach(Integer newSecurityBreach) {
		Integer oldSecurityBreach = securityBreach;
		securityBreach = newSecurityBreach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_FRAME__SECURITY_BREACH, oldSecurityBreach, securityBreach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBreachDescription() {
		return breachDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBreachDescription(String newBreachDescription) {
		String oldBreachDescription = breachDescription;
		breachDescription = newBreachDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_FRAME__BREACH_DESCRIPTION, oldBreachDescription, breachDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLocked(Boolean newIsLocked) {
		Boolean oldIsLocked = isLocked;
		isLocked = newIsLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_FRAME__IS_LOCKED, oldIsLocked, isLocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_FRAME__CABLE_MANAGEMENT_STRATEGY:
				return getCableManagementStrategy();
			case CimPackage.CIM_PHYSICAL_FRAME__SERVICE_PHILOSOPHY:
				return getServicePhilosophy();
			case CimPackage.CIM_PHYSICAL_FRAME__SERVICE_DESCRIPTIONS:
				return getServiceDescriptions();
			case CimPackage.CIM_PHYSICAL_FRAME__LOCK_PRESENT:
				return getLockPresent();
			case CimPackage.CIM_PHYSICAL_FRAME__AUDIBLE_ALARM:
				return getAudibleAlarm();
			case CimPackage.CIM_PHYSICAL_FRAME__VISIBLE_ALARM:
				return getVisibleAlarm();
			case CimPackage.CIM_PHYSICAL_FRAME__SECURITY_BREACH:
				return getSecurityBreach();
			case CimPackage.CIM_PHYSICAL_FRAME__BREACH_DESCRIPTION:
				return getBreachDescription();
			case CimPackage.CIM_PHYSICAL_FRAME__IS_LOCKED:
				return getIsLocked();
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
			case CimPackage.CIM_PHYSICAL_FRAME__CABLE_MANAGEMENT_STRATEGY:
				setCableManagementStrategy((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__SERVICE_PHILOSOPHY:
				getServicePhilosophy().clear();
				getServicePhilosophy().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__SERVICE_DESCRIPTIONS:
				getServiceDescriptions().clear();
				getServiceDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__LOCK_PRESENT:
				setLockPresent((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__AUDIBLE_ALARM:
				setAudibleAlarm((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__VISIBLE_ALARM:
				setVisibleAlarm((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__SECURITY_BREACH:
				setSecurityBreach((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__BREACH_DESCRIPTION:
				setBreachDescription((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__IS_LOCKED:
				setIsLocked((Boolean)newValue);
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
			case CimPackage.CIM_PHYSICAL_FRAME__CABLE_MANAGEMENT_STRATEGY:
				setCableManagementStrategy(CABLE_MANAGEMENT_STRATEGY_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__SERVICE_PHILOSOPHY:
				getServicePhilosophy().clear();
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__SERVICE_DESCRIPTIONS:
				getServiceDescriptions().clear();
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__LOCK_PRESENT:
				setLockPresent(LOCK_PRESENT_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__AUDIBLE_ALARM:
				setAudibleAlarm(AUDIBLE_ALARM_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__VISIBLE_ALARM:
				setVisibleAlarm(VISIBLE_ALARM_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__SECURITY_BREACH:
				setSecurityBreach(SECURITY_BREACH_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__BREACH_DESCRIPTION:
				setBreachDescription(BREACH_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_FRAME__IS_LOCKED:
				setIsLocked(IS_LOCKED_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_FRAME__CABLE_MANAGEMENT_STRATEGY:
				return CABLE_MANAGEMENT_STRATEGY_EDEFAULT == null ? cableManagementStrategy != null : !CABLE_MANAGEMENT_STRATEGY_EDEFAULT.equals(cableManagementStrategy);
			case CimPackage.CIM_PHYSICAL_FRAME__SERVICE_PHILOSOPHY:
				return servicePhilosophy != null && !servicePhilosophy.isEmpty();
			case CimPackage.CIM_PHYSICAL_FRAME__SERVICE_DESCRIPTIONS:
				return serviceDescriptions != null && !serviceDescriptions.isEmpty();
			case CimPackage.CIM_PHYSICAL_FRAME__LOCK_PRESENT:
				return LOCK_PRESENT_EDEFAULT == null ? lockPresent != null : !LOCK_PRESENT_EDEFAULT.equals(lockPresent);
			case CimPackage.CIM_PHYSICAL_FRAME__AUDIBLE_ALARM:
				return AUDIBLE_ALARM_EDEFAULT == null ? audibleAlarm != null : !AUDIBLE_ALARM_EDEFAULT.equals(audibleAlarm);
			case CimPackage.CIM_PHYSICAL_FRAME__VISIBLE_ALARM:
				return VISIBLE_ALARM_EDEFAULT == null ? visibleAlarm != null : !VISIBLE_ALARM_EDEFAULT.equals(visibleAlarm);
			case CimPackage.CIM_PHYSICAL_FRAME__SECURITY_BREACH:
				return SECURITY_BREACH_EDEFAULT == null ? securityBreach != null : !SECURITY_BREACH_EDEFAULT.equals(securityBreach);
			case CimPackage.CIM_PHYSICAL_FRAME__BREACH_DESCRIPTION:
				return BREACH_DESCRIPTION_EDEFAULT == null ? breachDescription != null : !BREACH_DESCRIPTION_EDEFAULT.equals(breachDescription);
			case CimPackage.CIM_PHYSICAL_FRAME__IS_LOCKED:
				return IS_LOCKED_EDEFAULT == null ? isLocked != null : !IS_LOCKED_EDEFAULT.equals(isLocked);
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
		result.append(" (CableManagementStrategy: ");
		result.append(cableManagementStrategy);
		result.append(", ServicePhilosophy: ");
		result.append(servicePhilosophy);
		result.append(", ServiceDescriptions: ");
		result.append(serviceDescriptions);
		result.append(", LockPresent: ");
		result.append(lockPresent);
		result.append(", AudibleAlarm: ");
		result.append(audibleAlarm);
		result.append(", VisibleAlarm: ");
		result.append(visibleAlarm);
		result.append(", SecurityBreach: ");
		result.append(securityBreach);
		result.append(", BreachDescription: ");
		result.append(breachDescription);
		result.append(", IsLocked: ");
		result.append(isLocked);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalFrameImpl
