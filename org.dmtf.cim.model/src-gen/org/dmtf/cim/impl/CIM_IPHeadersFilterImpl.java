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

import org.dmtf.cim.CIM_IPHeadersFilter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Headers Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrIPVersion <em>Hdr IP Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrSrcAddress <em>Hdr Src Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrSrcAddressEndOfRange <em>Hdr Src Address End Of Range</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrSrcMask <em>Hdr Src Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrDestAddress <em>Hdr Dest Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrDestAddressEndOfRange <em>Hdr Dest Address End Of Range</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrDestMask <em>Hdr Dest Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrProtocolID <em>Hdr Protocol ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrSrcPortStart <em>Hdr Src Port Start</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrSrcPortEnd <em>Hdr Src Port End</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrDestPortStart <em>Hdr Dest Port Start</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrDestPortEnd <em>Hdr Dest Port End</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrDSCP <em>Hdr DSCP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPHeadersFilterImpl#getHdrFlowLabel <em>Hdr Flow Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPHeadersFilterImpl extends CIM_FilterEntryBaseImpl implements CIM_IPHeadersFilter {
	/**
	 * The default value of the '{@link #getHdrIPVersion() <em>Hdr IP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrIPVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HDR_IP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdrIPVersion() <em>Hdr IP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrIPVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer hdrIPVersion = HDR_IP_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHdrSrcAddress() <em>Hdr Src Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrSrcAddress;

	/**
	 * The cached value of the '{@link #getHdrSrcAddressEndOfRange() <em>Hdr Src Address End Of Range</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcAddressEndOfRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrSrcAddressEndOfRange;

	/**
	 * The cached value of the '{@link #getHdrSrcMask() <em>Hdr Src Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrSrcMask;

	/**
	 * The cached value of the '{@link #getHdrDestAddress() <em>Hdr Dest Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDestAddress;

	/**
	 * The cached value of the '{@link #getHdrDestAddressEndOfRange() <em>Hdr Dest Address End Of Range</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestAddressEndOfRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDestAddressEndOfRange;

	/**
	 * The cached value of the '{@link #getHdrDestMask() <em>Hdr Dest Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDestMask;

	/**
	 * The default value of the '{@link #getHdrProtocolID() <em>Hdr Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrProtocolID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HDR_PROTOCOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdrProtocolID() <em>Hdr Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrProtocolID()
	 * @generated
	 * @ordered
	 */
	protected Integer hdrProtocolID = HDR_PROTOCOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrSrcPortStart() <em>Hdr Src Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcPortStart()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HDR_SRC_PORT_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdrSrcPortStart() <em>Hdr Src Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcPortStart()
	 * @generated
	 * @ordered
	 */
	protected Integer hdrSrcPortStart = HDR_SRC_PORT_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrSrcPortEnd() <em>Hdr Src Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcPortEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HDR_SRC_PORT_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdrSrcPortEnd() <em>Hdr Src Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcPortEnd()
	 * @generated
	 * @ordered
	 */
	protected Integer hdrSrcPortEnd = HDR_SRC_PORT_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrDestPortStart() <em>Hdr Dest Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestPortStart()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HDR_DEST_PORT_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdrDestPortStart() <em>Hdr Dest Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestPortStart()
	 * @generated
	 * @ordered
	 */
	protected Integer hdrDestPortStart = HDR_DEST_PORT_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrDestPortEnd() <em>Hdr Dest Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestPortEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HDR_DEST_PORT_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdrDestPortEnd() <em>Hdr Dest Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestPortEnd()
	 * @generated
	 * @ordered
	 */
	protected Integer hdrDestPortEnd = HDR_DEST_PORT_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHdrDSCP() <em>Hdr DSCP</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDSCP()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDSCP;

	/**
	 * The cached value of the '{@link #getHdrFlowLabel() <em>Hdr Flow Label</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrFlowLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrFlowLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPHeadersFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPHeadersFilter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHdrIPVersion() {
		return hdrIPVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdrIPVersion(Integer newHdrIPVersion) {
		Integer oldHdrIPVersion = hdrIPVersion;
		hdrIPVersion = newHdrIPVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_HEADERS_FILTER__HDR_IP_VERSION, oldHdrIPVersion, hdrIPVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrSrcAddress() {
		if (hdrSrcAddress == null) {
			hdrSrcAddress = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS);
		}
		return hdrSrcAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrSrcAddressEndOfRange() {
		if (hdrSrcAddressEndOfRange == null) {
			hdrSrcAddressEndOfRange = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE);
		}
		return hdrSrcAddressEndOfRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrSrcMask() {
		if (hdrSrcMask == null) {
			hdrSrcMask = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_MASK);
		}
		return hdrSrcMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrDestAddress() {
		if (hdrDestAddress == null) {
			hdrDestAddress = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS);
		}
		return hdrDestAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrDestAddressEndOfRange() {
		if (hdrDestAddressEndOfRange == null) {
			hdrDestAddressEndOfRange = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE);
		}
		return hdrDestAddressEndOfRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrDestMask() {
		if (hdrDestMask == null) {
			hdrDestMask = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_MASK);
		}
		return hdrDestMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHdrProtocolID() {
		return hdrProtocolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdrProtocolID(Integer newHdrProtocolID) {
		Integer oldHdrProtocolID = hdrProtocolID;
		hdrProtocolID = newHdrProtocolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_HEADERS_FILTER__HDR_PROTOCOL_ID, oldHdrProtocolID, hdrProtocolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHdrSrcPortStart() {
		return hdrSrcPortStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdrSrcPortStart(Integer newHdrSrcPortStart) {
		Integer oldHdrSrcPortStart = hdrSrcPortStart;
		hdrSrcPortStart = newHdrSrcPortStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_START, oldHdrSrcPortStart, hdrSrcPortStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHdrSrcPortEnd() {
		return hdrSrcPortEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdrSrcPortEnd(Integer newHdrSrcPortEnd) {
		Integer oldHdrSrcPortEnd = hdrSrcPortEnd;
		hdrSrcPortEnd = newHdrSrcPortEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_END, oldHdrSrcPortEnd, hdrSrcPortEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHdrDestPortStart() {
		return hdrDestPortStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdrDestPortStart(Integer newHdrDestPortStart) {
		Integer oldHdrDestPortStart = hdrDestPortStart;
		hdrDestPortStart = newHdrDestPortStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_START, oldHdrDestPortStart, hdrDestPortStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHdrDestPortEnd() {
		return hdrDestPortEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdrDestPortEnd(Integer newHdrDestPortEnd) {
		Integer oldHdrDestPortEnd = hdrDestPortEnd;
		hdrDestPortEnd = newHdrDestPortEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_END, oldHdrDestPortEnd, hdrDestPortEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrDSCP() {
		if (hdrDSCP == null) {
			hdrDSCP = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IP_HEADERS_FILTER__HDR_DSCP);
		}
		return hdrDSCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHdrFlowLabel() {
		if (hdrFlowLabel == null) {
			hdrFlowLabel = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IP_HEADERS_FILTER__HDR_FLOW_LABEL);
		}
		return hdrFlowLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_IP_VERSION:
				return getHdrIPVersion();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS:
				return getHdrSrcAddress();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE:
				return getHdrSrcAddressEndOfRange();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_MASK:
				return getHdrSrcMask();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS:
				return getHdrDestAddress();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE:
				return getHdrDestAddressEndOfRange();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_MASK:
				return getHdrDestMask();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_PROTOCOL_ID:
				return getHdrProtocolID();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_START:
				return getHdrSrcPortStart();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_END:
				return getHdrSrcPortEnd();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_START:
				return getHdrDestPortStart();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_END:
				return getHdrDestPortEnd();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DSCP:
				return getHdrDSCP();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_FLOW_LABEL:
				return getHdrFlowLabel();
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
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_IP_VERSION:
				setHdrIPVersion((Integer)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS:
				getHdrSrcAddress().clear();
				getHdrSrcAddress().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE:
				getHdrSrcAddressEndOfRange().clear();
				getHdrSrcAddressEndOfRange().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_MASK:
				getHdrSrcMask().clear();
				getHdrSrcMask().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS:
				getHdrDestAddress().clear();
				getHdrDestAddress().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE:
				getHdrDestAddressEndOfRange().clear();
				getHdrDestAddressEndOfRange().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_MASK:
				getHdrDestMask().clear();
				getHdrDestMask().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_PROTOCOL_ID:
				setHdrProtocolID((Integer)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_START:
				setHdrSrcPortStart((Integer)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_END:
				setHdrSrcPortEnd((Integer)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_START:
				setHdrDestPortStart((Integer)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_END:
				setHdrDestPortEnd((Integer)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DSCP:
				getHdrDSCP().clear();
				getHdrDSCP().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_FLOW_LABEL:
				getHdrFlowLabel().clear();
				getHdrFlowLabel().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_IP_VERSION:
				setHdrIPVersion(HDR_IP_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS:
				getHdrSrcAddress().clear();
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE:
				getHdrSrcAddressEndOfRange().clear();
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_MASK:
				getHdrSrcMask().clear();
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS:
				getHdrDestAddress().clear();
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE:
				getHdrDestAddressEndOfRange().clear();
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_MASK:
				getHdrDestMask().clear();
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_PROTOCOL_ID:
				setHdrProtocolID(HDR_PROTOCOL_ID_EDEFAULT);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_START:
				setHdrSrcPortStart(HDR_SRC_PORT_START_EDEFAULT);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_END:
				setHdrSrcPortEnd(HDR_SRC_PORT_END_EDEFAULT);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_START:
				setHdrDestPortStart(HDR_DEST_PORT_START_EDEFAULT);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_END:
				setHdrDestPortEnd(HDR_DEST_PORT_END_EDEFAULT);
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DSCP:
				getHdrDSCP().clear();
				return;
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_FLOW_LABEL:
				getHdrFlowLabel().clear();
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
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_IP_VERSION:
				return HDR_IP_VERSION_EDEFAULT == null ? hdrIPVersion != null : !HDR_IP_VERSION_EDEFAULT.equals(hdrIPVersion);
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS:
				return hdrSrcAddress != null && !hdrSrcAddress.isEmpty();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE:
				return hdrSrcAddressEndOfRange != null && !hdrSrcAddressEndOfRange.isEmpty();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_MASK:
				return hdrSrcMask != null && !hdrSrcMask.isEmpty();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS:
				return hdrDestAddress != null && !hdrDestAddress.isEmpty();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE:
				return hdrDestAddressEndOfRange != null && !hdrDestAddressEndOfRange.isEmpty();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_MASK:
				return hdrDestMask != null && !hdrDestMask.isEmpty();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_PROTOCOL_ID:
				return HDR_PROTOCOL_ID_EDEFAULT == null ? hdrProtocolID != null : !HDR_PROTOCOL_ID_EDEFAULT.equals(hdrProtocolID);
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_START:
				return HDR_SRC_PORT_START_EDEFAULT == null ? hdrSrcPortStart != null : !HDR_SRC_PORT_START_EDEFAULT.equals(hdrSrcPortStart);
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_SRC_PORT_END:
				return HDR_SRC_PORT_END_EDEFAULT == null ? hdrSrcPortEnd != null : !HDR_SRC_PORT_END_EDEFAULT.equals(hdrSrcPortEnd);
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_START:
				return HDR_DEST_PORT_START_EDEFAULT == null ? hdrDestPortStart != null : !HDR_DEST_PORT_START_EDEFAULT.equals(hdrDestPortStart);
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DEST_PORT_END:
				return HDR_DEST_PORT_END_EDEFAULT == null ? hdrDestPortEnd != null : !HDR_DEST_PORT_END_EDEFAULT.equals(hdrDestPortEnd);
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_DSCP:
				return hdrDSCP != null && !hdrDSCP.isEmpty();
			case CimPackage.CIM_IP_HEADERS_FILTER__HDR_FLOW_LABEL:
				return hdrFlowLabel != null && !hdrFlowLabel.isEmpty();
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
		result.append(" (HdrIPVersion: ");
		result.append(hdrIPVersion);
		result.append(", HdrSrcAddress: ");
		result.append(hdrSrcAddress);
		result.append(", HdrSrcAddressEndOfRange: ");
		result.append(hdrSrcAddressEndOfRange);
		result.append(", HdrSrcMask: ");
		result.append(hdrSrcMask);
		result.append(", HdrDestAddress: ");
		result.append(hdrDestAddress);
		result.append(", HdrDestAddressEndOfRange: ");
		result.append(hdrDestAddressEndOfRange);
		result.append(", HdrDestMask: ");
		result.append(hdrDestMask);
		result.append(", HdrProtocolID: ");
		result.append(hdrProtocolID);
		result.append(", HdrSrcPortStart: ");
		result.append(hdrSrcPortStart);
		result.append(", HdrSrcPortEnd: ");
		result.append(hdrSrcPortEnd);
		result.append(", HdrDestPortStart: ");
		result.append(hdrDestPortStart);
		result.append(", HdrDestPortEnd: ");
		result.append(hdrDestPortEnd);
		result.append(", HdrDSCP: ");
		result.append(hdrDSCP);
		result.append(", HdrFlowLabel: ");
		result.append(hdrFlowLabel);
		result.append(')');
		return result.toString();
	}

} //CIM_IPHeadersFilterImpl
