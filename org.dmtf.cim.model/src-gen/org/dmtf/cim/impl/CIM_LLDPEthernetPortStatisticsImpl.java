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

import org.dmtf.cim.CIM_LLDPEthernetPortStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM LLDP Ethernet Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortStatisticsImpl#getTxDestMACAddress <em>Tx Dest MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortStatisticsImpl#getTxPortFramesTotal <em>Tx Port Frames Total</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortStatisticsImpl#getTxLLDPDULengthErrors <em>Tx LLDPDU Length Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortStatisticsImpl#getRxDestMACAddress <em>Rx Dest MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortStatisticsImpl#getRxPortFramesDiscardedTotal <em>Rx Port Frames Discarded Total</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortStatisticsImpl#getRxPortFramesErrors <em>Rx Port Frames Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortStatisticsImpl#getRxPortTLVsDiscardedTotal <em>Rx Port TL Vs Discarded Total</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortStatisticsImpl#getRxPortTLVsUnrecognizedTotal <em>Rx Port TL Vs Unrecognized Total</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortStatisticsImpl#getRxPortAgeoutsTotal <em>Rx Port Ageouts Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LLDPEthernetPortStatisticsImpl extends CIM_EthernetPortStatisticsImpl implements CIM_LLDPEthernetPortStatistics {
	/**
	 * The cached value of the '{@link #getTxDestMACAddress() <em>Tx Dest MAC Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxDestMACAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> txDestMACAddress;

	/**
	 * The cached value of the '{@link #getTxPortFramesTotal() <em>Tx Port Frames Total</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxPortFramesTotal()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> txPortFramesTotal;

	/**
	 * The cached value of the '{@link #getTxLLDPDULengthErrors() <em>Tx LLDPDU Length Errors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxLLDPDULengthErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> txLLDPDULengthErrors;

	/**
	 * The cached value of the '{@link #getRxDestMACAddress() <em>Rx Dest MAC Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxDestMACAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rxDestMACAddress;

	/**
	 * The cached value of the '{@link #getRxPortFramesDiscardedTotal() <em>Rx Port Frames Discarded Total</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxPortFramesDiscardedTotal()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> rxPortFramesDiscardedTotal;

	/**
	 * The cached value of the '{@link #getRxPortFramesErrors() <em>Rx Port Frames Errors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxPortFramesErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> rxPortFramesErrors;

	/**
	 * The cached value of the '{@link #getRxPortTLVsDiscardedTotal() <em>Rx Port TL Vs Discarded Total</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxPortTLVsDiscardedTotal()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> rxPortTLVsDiscardedTotal;

	/**
	 * The cached value of the '{@link #getRxPortTLVsUnrecognizedTotal() <em>Rx Port TL Vs Unrecognized Total</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxPortTLVsUnrecognizedTotal()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> rxPortTLVsUnrecognizedTotal;

	/**
	 * The cached value of the '{@link #getRxPortAgeoutsTotal() <em>Rx Port Ageouts Total</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxPortAgeoutsTotal()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> rxPortAgeoutsTotal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LLDPEthernetPortStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LLDPEthernetPortStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTxDestMACAddress() {
		if (txDestMACAddress == null) {
			txDestMACAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_DEST_MAC_ADDRESS);
		}
		return txDestMACAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getTxPortFramesTotal() {
		if (txPortFramesTotal == null) {
			txPortFramesTotal = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_PORT_FRAMES_TOTAL);
		}
		return txPortFramesTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getTxLLDPDULengthErrors() {
		if (txLLDPDULengthErrors == null) {
			txLLDPDULengthErrors = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_LLDPDU_LENGTH_ERRORS);
		}
		return txLLDPDULengthErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRxDestMACAddress() {
		if (rxDestMACAddress == null) {
			rxDestMACAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_DEST_MAC_ADDRESS);
		}
		return rxDestMACAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getRxPortFramesDiscardedTotal() {
		if (rxPortFramesDiscardedTotal == null) {
			rxPortFramesDiscardedTotal = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_DISCARDED_TOTAL);
		}
		return rxPortFramesDiscardedTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getRxPortFramesErrors() {
		if (rxPortFramesErrors == null) {
			rxPortFramesErrors = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_ERRORS);
		}
		return rxPortFramesErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getRxPortTLVsDiscardedTotal() {
		if (rxPortTLVsDiscardedTotal == null) {
			rxPortTLVsDiscardedTotal = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_DISCARDED_TOTAL);
		}
		return rxPortTLVsDiscardedTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getRxPortTLVsUnrecognizedTotal() {
		if (rxPortTLVsUnrecognizedTotal == null) {
			rxPortTLVsUnrecognizedTotal = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_UNRECOGNIZED_TOTAL);
		}
		return rxPortTLVsUnrecognizedTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getRxPortAgeoutsTotal() {
		if (rxPortAgeoutsTotal == null) {
			rxPortAgeoutsTotal = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_AGEOUTS_TOTAL);
		}
		return rxPortAgeoutsTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_DEST_MAC_ADDRESS:
				return getTxDestMACAddress();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_PORT_FRAMES_TOTAL:
				return getTxPortFramesTotal();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_LLDPDU_LENGTH_ERRORS:
				return getTxLLDPDULengthErrors();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_DEST_MAC_ADDRESS:
				return getRxDestMACAddress();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_DISCARDED_TOTAL:
				return getRxPortFramesDiscardedTotal();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_ERRORS:
				return getRxPortFramesErrors();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_DISCARDED_TOTAL:
				return getRxPortTLVsDiscardedTotal();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_UNRECOGNIZED_TOTAL:
				return getRxPortTLVsUnrecognizedTotal();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_AGEOUTS_TOTAL:
				return getRxPortAgeoutsTotal();
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
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_DEST_MAC_ADDRESS:
				getTxDestMACAddress().clear();
				getTxDestMACAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_PORT_FRAMES_TOTAL:
				getTxPortFramesTotal().clear();
				getTxPortFramesTotal().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_LLDPDU_LENGTH_ERRORS:
				getTxLLDPDULengthErrors().clear();
				getTxLLDPDULengthErrors().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_DEST_MAC_ADDRESS:
				getRxDestMACAddress().clear();
				getRxDestMACAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_DISCARDED_TOTAL:
				getRxPortFramesDiscardedTotal().clear();
				getRxPortFramesDiscardedTotal().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_ERRORS:
				getRxPortFramesErrors().clear();
				getRxPortFramesErrors().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_DISCARDED_TOTAL:
				getRxPortTLVsDiscardedTotal().clear();
				getRxPortTLVsDiscardedTotal().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_UNRECOGNIZED_TOTAL:
				getRxPortTLVsUnrecognizedTotal().clear();
				getRxPortTLVsUnrecognizedTotal().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_AGEOUTS_TOTAL:
				getRxPortAgeoutsTotal().clear();
				getRxPortAgeoutsTotal().addAll((Collection<? extends Long>)newValue);
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
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_DEST_MAC_ADDRESS:
				getTxDestMACAddress().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_PORT_FRAMES_TOTAL:
				getTxPortFramesTotal().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_LLDPDU_LENGTH_ERRORS:
				getTxLLDPDULengthErrors().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_DEST_MAC_ADDRESS:
				getRxDestMACAddress().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_DISCARDED_TOTAL:
				getRxPortFramesDiscardedTotal().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_ERRORS:
				getRxPortFramesErrors().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_DISCARDED_TOTAL:
				getRxPortTLVsDiscardedTotal().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_UNRECOGNIZED_TOTAL:
				getRxPortTLVsUnrecognizedTotal().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_AGEOUTS_TOTAL:
				getRxPortAgeoutsTotal().clear();
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
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_DEST_MAC_ADDRESS:
				return txDestMACAddress != null && !txDestMACAddress.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_PORT_FRAMES_TOTAL:
				return txPortFramesTotal != null && !txPortFramesTotal.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__TX_LLDPDU_LENGTH_ERRORS:
				return txLLDPDULengthErrors != null && !txLLDPDULengthErrors.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_DEST_MAC_ADDRESS:
				return rxDestMACAddress != null && !rxDestMACAddress.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_DISCARDED_TOTAL:
				return rxPortFramesDiscardedTotal != null && !rxPortFramesDiscardedTotal.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_FRAMES_ERRORS:
				return rxPortFramesErrors != null && !rxPortFramesErrors.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_DISCARDED_TOTAL:
				return rxPortTLVsDiscardedTotal != null && !rxPortTLVsDiscardedTotal.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_TL_VS_UNRECOGNIZED_TOTAL:
				return rxPortTLVsUnrecognizedTotal != null && !rxPortTLVsUnrecognizedTotal.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS__RX_PORT_AGEOUTS_TOTAL:
				return rxPortAgeoutsTotal != null && !rxPortAgeoutsTotal.isEmpty();
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
		result.append(" (TxDestMACAddress: ");
		result.append(txDestMACAddress);
		result.append(", TxPortFramesTotal: ");
		result.append(txPortFramesTotal);
		result.append(", TxLLDPDULengthErrors: ");
		result.append(txLLDPDULengthErrors);
		result.append(", RxDestMACAddress: ");
		result.append(rxDestMACAddress);
		result.append(", RxPortFramesDiscardedTotal: ");
		result.append(rxPortFramesDiscardedTotal);
		result.append(", RxPortFramesErrors: ");
		result.append(rxPortFramesErrors);
		result.append(", RxPortTLVsDiscardedTotal: ");
		result.append(rxPortTLVsDiscardedTotal);
		result.append(", RxPortTLVsUnrecognizedTotal: ");
		result.append(rxPortTLVsUnrecognizedTotal);
		result.append(", RxPortAgeoutsTotal: ");
		result.append(rxPortAgeoutsTotal);
		result.append(')');
		return result.toString();
	}

} //CIM_LLDPEthernetPortStatisticsImpl
