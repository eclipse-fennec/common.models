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

import org.dmtf.cim.CIM_IPsecSAEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IPsec SA Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecSAEndpointImpl#getSPI <em>SPI</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecSAEndpointImpl#getInboundDirection <em>Inbound Direction</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecSAEndpointImpl#getEncapsulationMode <em>Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecSAEndpointImpl#getDFHandling <em>DF Handling</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPsecSAEndpointImpl#getPFSInUse <em>PFS In Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPsecSAEndpointImpl extends CIM_SecurityAssociationEndpointImpl implements CIM_IPsecSAEndpoint {
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
	 * The default value of the '{@link #getEncapsulationMode() <em>Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENCAPSULATION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncapsulationMode() <em>Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationMode()
	 * @generated
	 * @ordered
	 */
	protected Integer encapsulationMode = ENCAPSULATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDFHandling() <em>DF Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFHandling()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DF_HANDLING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDFHandling() <em>DF Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFHandling()
	 * @generated
	 * @ordered
	 */
	protected Integer dfHandling = DF_HANDLING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPFSInUse() <em>PFS In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPFSInUse()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PFS_IN_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPFSInUse() <em>PFS In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPFSInUse()
	 * @generated
	 * @ordered
	 */
	protected Boolean pfsInUse = PFS_IN_USE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPsecSAEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPsecSAEndpoint();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_SA_ENDPOINT__SPI, oldSPI, spi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_SA_ENDPOINT__INBOUND_DIRECTION, oldInboundDirection, inboundDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEncapsulationMode() {
		return encapsulationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncapsulationMode(Integer newEncapsulationMode) {
		Integer oldEncapsulationMode = encapsulationMode;
		encapsulationMode = newEncapsulationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_SA_ENDPOINT__ENCAPSULATION_MODE, oldEncapsulationMode, encapsulationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDFHandling() {
		return dfHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDFHandling(Integer newDFHandling) {
		Integer oldDFHandling = dfHandling;
		dfHandling = newDFHandling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_SA_ENDPOINT__DF_HANDLING, oldDFHandling, dfHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPFSInUse() {
		return pfsInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPFSInUse(Boolean newPFSInUse) {
		Boolean oldPFSInUse = pfsInUse;
		pfsInUse = newPFSInUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPSEC_SA_ENDPOINT__PFS_IN_USE, oldPFSInUse, pfsInUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__SPI:
				return getSPI();
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__INBOUND_DIRECTION:
				return getInboundDirection();
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__ENCAPSULATION_MODE:
				return getEncapsulationMode();
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__DF_HANDLING:
				return getDFHandling();
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__PFS_IN_USE:
				return getPFSInUse();
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
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__SPI:
				setSPI((Long)newValue);
				return;
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__INBOUND_DIRECTION:
				setInboundDirection((Boolean)newValue);
				return;
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__ENCAPSULATION_MODE:
				setEncapsulationMode((Integer)newValue);
				return;
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__DF_HANDLING:
				setDFHandling((Integer)newValue);
				return;
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__PFS_IN_USE:
				setPFSInUse((Boolean)newValue);
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
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__SPI:
				setSPI(SPI_EDEFAULT);
				return;
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__INBOUND_DIRECTION:
				setInboundDirection(INBOUND_DIRECTION_EDEFAULT);
				return;
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__ENCAPSULATION_MODE:
				setEncapsulationMode(ENCAPSULATION_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__DF_HANDLING:
				setDFHandling(DF_HANDLING_EDEFAULT);
				return;
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__PFS_IN_USE:
				setPFSInUse(PFS_IN_USE_EDEFAULT);
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
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__SPI:
				return SPI_EDEFAULT == null ? spi != null : !SPI_EDEFAULT.equals(spi);
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__INBOUND_DIRECTION:
				return INBOUND_DIRECTION_EDEFAULT == null ? inboundDirection != null : !INBOUND_DIRECTION_EDEFAULT.equals(inboundDirection);
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__ENCAPSULATION_MODE:
				return ENCAPSULATION_MODE_EDEFAULT == null ? encapsulationMode != null : !ENCAPSULATION_MODE_EDEFAULT.equals(encapsulationMode);
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__DF_HANDLING:
				return DF_HANDLING_EDEFAULT == null ? dfHandling != null : !DF_HANDLING_EDEFAULT.equals(dfHandling);
			case CimPackage.CIM_IPSEC_SA_ENDPOINT__PFS_IN_USE:
				return PFS_IN_USE_EDEFAULT == null ? pfsInUse != null : !PFS_IN_USE_EDEFAULT.equals(pfsInUse);
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
		result.append(", EncapsulationMode: ");
		result.append(encapsulationMode);
		result.append(", DFHandling: ");
		result.append(dfHandling);
		result.append(", PFSInUse: ");
		result.append(pfsInUse);
		result.append(')');
		return result.toString();
	}

} //CIM_IPsecSAEndpointImpl
