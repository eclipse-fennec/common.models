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

import org.dmtf.cim.CIM_SwitchPortTransparentBridgingStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Switch Port Transparent Bridging Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortTransparentBridgingStatisticsImpl#getInFrames <em>In Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortTransparentBridgingStatisticsImpl#getOutFrames <em>Out Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortTransparentBridgingStatisticsImpl#getInDiscards <em>In Discards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SwitchPortTransparentBridgingStatisticsImpl extends CIM_SAPStatisticalInformationImpl implements CIM_SwitchPortTransparentBridgingStatistics {
	/**
	 * The default value of the '{@link #getInFrames() <em>In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long IN_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInFrames() <em>In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInFrames()
	 * @generated
	 * @ordered
	 */
	protected Long inFrames = IN_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutFrames() <em>Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long OUT_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutFrames() <em>Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutFrames()
	 * @generated
	 * @ordered
	 */
	protected Long outFrames = OUT_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInDiscards() <em>In Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInDiscards()
	 * @generated
	 * @ordered
	 */
	protected static final Long IN_DISCARDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInDiscards() <em>In Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInDiscards()
	 * @generated
	 * @ordered
	 */
	protected Long inDiscards = IN_DISCARDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SwitchPortTransparentBridgingStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SwitchPortTransparentBridgingStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInFrames() {
		return inFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInFrames(Long newInFrames) {
		Long oldInFrames = inFrames;
		inFrames = newInFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_FRAMES, oldInFrames, inFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOutFrames() {
		return outFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutFrames(Long newOutFrames) {
		Long oldOutFrames = outFrames;
		outFrames = newOutFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__OUT_FRAMES, oldOutFrames, outFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInDiscards() {
		return inDiscards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInDiscards(Long newInDiscards) {
		Long oldInDiscards = inDiscards;
		inDiscards = newInDiscards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_DISCARDS, oldInDiscards, inDiscards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_FRAMES:
				return getInFrames();
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__OUT_FRAMES:
				return getOutFrames();
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_DISCARDS:
				return getInDiscards();
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
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_FRAMES:
				setInFrames((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__OUT_FRAMES:
				setOutFrames((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_DISCARDS:
				setInDiscards((Long)newValue);
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
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_FRAMES:
				setInFrames(IN_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__OUT_FRAMES:
				setOutFrames(OUT_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_DISCARDS:
				setInDiscards(IN_DISCARDS_EDEFAULT);
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
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_FRAMES:
				return IN_FRAMES_EDEFAULT == null ? inFrames != null : !IN_FRAMES_EDEFAULT.equals(inFrames);
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__OUT_FRAMES:
				return OUT_FRAMES_EDEFAULT == null ? outFrames != null : !OUT_FRAMES_EDEFAULT.equals(outFrames);
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS__IN_DISCARDS:
				return IN_DISCARDS_EDEFAULT == null ? inDiscards != null : !IN_DISCARDS_EDEFAULT.equals(inDiscards);
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
		result.append(" (InFrames: ");
		result.append(inFrames);
		result.append(", OutFrames: ");
		result.append(outFrames);
		result.append(", InDiscards: ");
		result.append(inDiscards);
		result.append(')');
		return result.toString();
	}

} //CIM_SwitchPortTransparentBridgingStatisticsImpl
