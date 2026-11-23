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

import org.dmtf.cim.CIM_LogicalPortStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortStatisticsImpl#getBytesTransmitted <em>Bytes Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortStatisticsImpl#getBytesReceived <em>Bytes Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortStatisticsImpl#getPacketsTransmitted <em>Packets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortStatisticsImpl#getPacketsReceived <em>Packets Received</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogicalPortStatisticsImpl extends CIM_StatisticalDataImpl implements CIM_LogicalPortStatistics {
	/**
	 * The default value of the '{@link #getBytesTransmitted() <em>Bytes Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesTransmitted() <em>Bytes Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long bytesTransmitted = BYTES_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesReceived() <em>Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesReceived() <em>Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesReceived()
	 * @generated
	 * @ordered
	 */
	protected Long bytesReceived = BYTES_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketsTransmitted() <em>Packets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long PACKETS_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketsTransmitted() <em>Packets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long packetsTransmitted = PACKETS_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketsReceived() <em>Packets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long PACKETS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketsReceived() <em>Packets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long packetsReceived = PACKETS_RECEIVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalPortStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalPortStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesTransmitted() {
		return bytesTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesTransmitted(Long newBytesTransmitted) {
		Long oldBytesTransmitted = bytesTransmitted;
		bytesTransmitted = newBytesTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_TRANSMITTED, oldBytesTransmitted, bytesTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesReceived(Long newBytesReceived) {
		Long oldBytesReceived = bytesReceived;
		bytesReceived = newBytesReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_RECEIVED, oldBytesReceived, bytesReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPacketsTransmitted() {
		return packetsTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPacketsTransmitted(Long newPacketsTransmitted) {
		Long oldPacketsTransmitted = packetsTransmitted;
		packetsTransmitted = newPacketsTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_TRANSMITTED, oldPacketsTransmitted, packetsTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPacketsReceived(Long newPacketsReceived) {
		Long oldPacketsReceived = packetsReceived;
		packetsReceived = newPacketsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_RECEIVED, oldPacketsReceived, packetsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_TRANSMITTED:
				return getBytesTransmitted();
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_RECEIVED:
				return getBytesReceived();
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_TRANSMITTED:
				return getPacketsTransmitted();
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_RECEIVED:
				return getPacketsReceived();
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
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_TRANSMITTED:
				setBytesTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_RECEIVED:
				setBytesReceived((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_TRANSMITTED:
				setPacketsTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_RECEIVED:
				setPacketsReceived((Long)newValue);
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
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_TRANSMITTED:
				setBytesTransmitted(BYTES_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_RECEIVED:
				setBytesReceived(BYTES_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_TRANSMITTED:
				setPacketsTransmitted(PACKETS_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_RECEIVED:
				setPacketsReceived(PACKETS_RECEIVED_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_TRANSMITTED:
				return BYTES_TRANSMITTED_EDEFAULT == null ? bytesTransmitted != null : !BYTES_TRANSMITTED_EDEFAULT.equals(bytesTransmitted);
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__BYTES_RECEIVED:
				return BYTES_RECEIVED_EDEFAULT == null ? bytesReceived != null : !BYTES_RECEIVED_EDEFAULT.equals(bytesReceived);
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_TRANSMITTED:
				return PACKETS_TRANSMITTED_EDEFAULT == null ? packetsTransmitted != null : !PACKETS_TRANSMITTED_EDEFAULT.equals(packetsTransmitted);
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS__PACKETS_RECEIVED:
				return PACKETS_RECEIVED_EDEFAULT == null ? packetsReceived != null : !PACKETS_RECEIVED_EDEFAULT.equals(packetsReceived);
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
		result.append(" (BytesTransmitted: ");
		result.append(bytesTransmitted);
		result.append(", BytesReceived: ");
		result.append(bytesReceived);
		result.append(", PacketsTransmitted: ");
		result.append(packetsTransmitted);
		result.append(", PacketsReceived: ");
		result.append(packetsReceived);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalPortStatisticsImpl
