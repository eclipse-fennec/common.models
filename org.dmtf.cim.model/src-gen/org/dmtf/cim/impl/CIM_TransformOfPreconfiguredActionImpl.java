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

import org.dmtf.cim.CIM_TransformOfPreconfiguredAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Transform Of Preconfigured Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TransformOfPreconfiguredActionImpl#getSPI <em>SPI</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TransformOfPreconfiguredActionImpl#getInboundDirection <em>Inbound Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TransformOfPreconfiguredActionImpl extends CIM_DependencyImpl implements CIM_TransformOfPreconfiguredAction {
	/**
	 * The default value of the '{@link #getSPI() <em>SPI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPI()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPI() <em>SPI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPI()
	 * @generated
	 * @ordered
	 */
	protected Long spi = SPI_EDEFAULT;

	/**
	 * The default value of the '{@link #getInboundDirection() <em>Inbound Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INBOUND_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInboundDirection() <em>Inbound Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundDirection()
	 * @generated
	 * @ordered
	 */
	protected Boolean inboundDirection = INBOUND_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TransformOfPreconfiguredActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TransformOfPreconfiguredAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSPI() {
		return spi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPI(Long newSPI) {
		Long oldSPI = spi;
		spi = newSPI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__SPI, oldSPI, spi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInboundDirection() {
		return inboundDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInboundDirection(Boolean newInboundDirection) {
		Boolean oldInboundDirection = inboundDirection;
		inboundDirection = newInboundDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__INBOUND_DIRECTION, oldInboundDirection, inboundDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__SPI:
				return getSPI();
			case CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__INBOUND_DIRECTION:
				return getInboundDirection();
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
			case CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__SPI:
				setSPI((Long)newValue);
				return;
			case CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__INBOUND_DIRECTION:
				setInboundDirection((Boolean)newValue);
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
			case CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__SPI:
				setSPI(SPI_EDEFAULT);
				return;
			case CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__INBOUND_DIRECTION:
				setInboundDirection(INBOUND_DIRECTION_EDEFAULT);
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
			case CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__SPI:
				return SPI_EDEFAULT == null ? spi != null : !SPI_EDEFAULT.equals(spi);
			case CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION__INBOUND_DIRECTION:
				return INBOUND_DIRECTION_EDEFAULT == null ? inboundDirection != null : !INBOUND_DIRECTION_EDEFAULT.equals(inboundDirection);
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
		result.append(" (SPI: ");
		result.append(spi);
		result.append(", InboundDirection: ");
		result.append(inboundDirection);
		result.append(')');
		return result.toString();
	}

} //CIM_TransformOfPreconfiguredActionImpl
