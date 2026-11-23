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

import org.dmtf.cim.CIM_OSPFService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM OSPF Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFServiceImpl#getRunningMOSPF <em>Running MOSPF</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFServiceImpl#getIsInterAreaMulticastForwarder <em>Is Inter Area Multicast Forwarder</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFServiceImpl#getIsInterAsMulticastForwarder <em>Is Inter As Multicast Forwarder</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFServiceImpl#getExitOverflowInterval <em>Exit Overflow Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFServiceImpl#getRFC1583Compatibility <em>RFC1583 Compatibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OSPFServiceImpl extends CIM_RouteCalculationServiceImpl implements CIM_OSPFService {
	/**
	 * The default value of the '{@link #getRunningMOSPF() <em>Running MOSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningMOSPF()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RUNNING_MOSPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunningMOSPF() <em>Running MOSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningMOSPF()
	 * @generated
	 * @ordered
	 */
	protected Boolean runningMOSPF = RUNNING_MOSPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsInterAreaMulticastForwarder() <em>Is Inter Area Multicast Forwarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInterAreaMulticastForwarder()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INTER_AREA_MULTICAST_FORWARDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsInterAreaMulticastForwarder() <em>Is Inter Area Multicast Forwarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInterAreaMulticastForwarder()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInterAreaMulticastForwarder = IS_INTER_AREA_MULTICAST_FORWARDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsInterAsMulticastForwarder() <em>Is Inter As Multicast Forwarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInterAsMulticastForwarder()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INTER_AS_MULTICAST_FORWARDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsInterAsMulticastForwarder() <em>Is Inter As Multicast Forwarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInterAsMulticastForwarder()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInterAsMulticastForwarder = IS_INTER_AS_MULTICAST_FORWARDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExitOverflowInterval() <em>Exit Overflow Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitOverflowInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXIT_OVERFLOW_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExitOverflowInterval() <em>Exit Overflow Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitOverflowInterval()
	 * @generated
	 * @ordered
	 */
	protected Long exitOverflowInterval = EXIT_OVERFLOW_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRFC1583Compatibility() <em>RFC1583 Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFC1583Compatibility()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RFC1583_COMPATIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRFC1583Compatibility() <em>RFC1583 Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFC1583Compatibility()
	 * @generated
	 * @ordered
	 */
	protected Boolean rfc1583Compatibility = RFC1583_COMPATIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OSPFServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OSPFService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRunningMOSPF() {
		return runningMOSPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunningMOSPF(Boolean newRunningMOSPF) {
		Boolean oldRunningMOSPF = runningMOSPF;
		runningMOSPF = newRunningMOSPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_SERVICE__RUNNING_MOSPF, oldRunningMOSPF, runningMOSPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsInterAreaMulticastForwarder() {
		return isInterAreaMulticastForwarder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsInterAreaMulticastForwarder(Boolean newIsInterAreaMulticastForwarder) {
		Boolean oldIsInterAreaMulticastForwarder = isInterAreaMulticastForwarder;
		isInterAreaMulticastForwarder = newIsInterAreaMulticastForwarder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_SERVICE__IS_INTER_AREA_MULTICAST_FORWARDER, oldIsInterAreaMulticastForwarder, isInterAreaMulticastForwarder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsInterAsMulticastForwarder() {
		return isInterAsMulticastForwarder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsInterAsMulticastForwarder(Boolean newIsInterAsMulticastForwarder) {
		Boolean oldIsInterAsMulticastForwarder = isInterAsMulticastForwarder;
		isInterAsMulticastForwarder = newIsInterAsMulticastForwarder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_SERVICE__IS_INTER_AS_MULTICAST_FORWARDER, oldIsInterAsMulticastForwarder, isInterAsMulticastForwarder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExitOverflowInterval() {
		return exitOverflowInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitOverflowInterval(Long newExitOverflowInterval) {
		Long oldExitOverflowInterval = exitOverflowInterval;
		exitOverflowInterval = newExitOverflowInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_SERVICE__EXIT_OVERFLOW_INTERVAL, oldExitOverflowInterval, exitOverflowInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRFC1583Compatibility() {
		return rfc1583Compatibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRFC1583Compatibility(Boolean newRFC1583Compatibility) {
		Boolean oldRFC1583Compatibility = rfc1583Compatibility;
		rfc1583Compatibility = newRFC1583Compatibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_SERVICE__RFC1583_COMPATIBILITY, oldRFC1583Compatibility, rfc1583Compatibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OSPF_SERVICE__RUNNING_MOSPF:
				return getRunningMOSPF();
			case CimPackage.CIM_OSPF_SERVICE__IS_INTER_AREA_MULTICAST_FORWARDER:
				return getIsInterAreaMulticastForwarder();
			case CimPackage.CIM_OSPF_SERVICE__IS_INTER_AS_MULTICAST_FORWARDER:
				return getIsInterAsMulticastForwarder();
			case CimPackage.CIM_OSPF_SERVICE__EXIT_OVERFLOW_INTERVAL:
				return getExitOverflowInterval();
			case CimPackage.CIM_OSPF_SERVICE__RFC1583_COMPATIBILITY:
				return getRFC1583Compatibility();
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
			case CimPackage.CIM_OSPF_SERVICE__RUNNING_MOSPF:
				setRunningMOSPF((Boolean)newValue);
				return;
			case CimPackage.CIM_OSPF_SERVICE__IS_INTER_AREA_MULTICAST_FORWARDER:
				setIsInterAreaMulticastForwarder((Boolean)newValue);
				return;
			case CimPackage.CIM_OSPF_SERVICE__IS_INTER_AS_MULTICAST_FORWARDER:
				setIsInterAsMulticastForwarder((Boolean)newValue);
				return;
			case CimPackage.CIM_OSPF_SERVICE__EXIT_OVERFLOW_INTERVAL:
				setExitOverflowInterval((Long)newValue);
				return;
			case CimPackage.CIM_OSPF_SERVICE__RFC1583_COMPATIBILITY:
				setRFC1583Compatibility((Boolean)newValue);
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
			case CimPackage.CIM_OSPF_SERVICE__RUNNING_MOSPF:
				setRunningMOSPF(RUNNING_MOSPF_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_SERVICE__IS_INTER_AREA_MULTICAST_FORWARDER:
				setIsInterAreaMulticastForwarder(IS_INTER_AREA_MULTICAST_FORWARDER_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_SERVICE__IS_INTER_AS_MULTICAST_FORWARDER:
				setIsInterAsMulticastForwarder(IS_INTER_AS_MULTICAST_FORWARDER_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_SERVICE__EXIT_OVERFLOW_INTERVAL:
				setExitOverflowInterval(EXIT_OVERFLOW_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_SERVICE__RFC1583_COMPATIBILITY:
				setRFC1583Compatibility(RFC1583_COMPATIBILITY_EDEFAULT);
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
			case CimPackage.CIM_OSPF_SERVICE__RUNNING_MOSPF:
				return RUNNING_MOSPF_EDEFAULT == null ? runningMOSPF != null : !RUNNING_MOSPF_EDEFAULT.equals(runningMOSPF);
			case CimPackage.CIM_OSPF_SERVICE__IS_INTER_AREA_MULTICAST_FORWARDER:
				return IS_INTER_AREA_MULTICAST_FORWARDER_EDEFAULT == null ? isInterAreaMulticastForwarder != null : !IS_INTER_AREA_MULTICAST_FORWARDER_EDEFAULT.equals(isInterAreaMulticastForwarder);
			case CimPackage.CIM_OSPF_SERVICE__IS_INTER_AS_MULTICAST_FORWARDER:
				return IS_INTER_AS_MULTICAST_FORWARDER_EDEFAULT == null ? isInterAsMulticastForwarder != null : !IS_INTER_AS_MULTICAST_FORWARDER_EDEFAULT.equals(isInterAsMulticastForwarder);
			case CimPackage.CIM_OSPF_SERVICE__EXIT_OVERFLOW_INTERVAL:
				return EXIT_OVERFLOW_INTERVAL_EDEFAULT == null ? exitOverflowInterval != null : !EXIT_OVERFLOW_INTERVAL_EDEFAULT.equals(exitOverflowInterval);
			case CimPackage.CIM_OSPF_SERVICE__RFC1583_COMPATIBILITY:
				return RFC1583_COMPATIBILITY_EDEFAULT == null ? rfc1583Compatibility != null : !RFC1583_COMPATIBILITY_EDEFAULT.equals(rfc1583Compatibility);
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
		result.append(" (RunningMOSPF: ");
		result.append(runningMOSPF);
		result.append(", IsInterAreaMulticastForwarder: ");
		result.append(isInterAreaMulticastForwarder);
		result.append(", IsInterAsMulticastForwarder: ");
		result.append(isInterAsMulticastForwarder);
		result.append(", ExitOverflowInterval: ");
		result.append(exitOverflowInterval);
		result.append(", RFC1583Compatibility: ");
		result.append(rfc1583Compatibility);
		result.append(')');
		return result.toString();
	}

} //CIM_OSPFServiceImpl
