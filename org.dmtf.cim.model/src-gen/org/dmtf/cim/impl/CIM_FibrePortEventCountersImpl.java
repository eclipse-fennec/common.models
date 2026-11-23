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

import org.dmtf.cim.CIM_FibrePortEventCounters;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Fibre Port Event Counters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortEventCountersImpl#getPLOGIsReceived <em>PLOG Is Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortEventCountersImpl#getPLOGIsSent <em>PLOG Is Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortEventCountersImpl#getEOFAbortsReceived <em>EOF Aborts Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortEventCountersImpl#getEOFAbortsTransmitted <em>EOF Aborts Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortEventCountersImpl#getPLOGOsReceived <em>PLOG Os Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortEventCountersImpl#getPLOGOsSent <em>PLOG Os Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortEventCountersImpl#getPLOGIsRejected <em>PLOG Is Rejected</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortEventCountersImpl#getPLOGOsRejected <em>PLOG Os Rejected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FibrePortEventCountersImpl extends CIM_DeviceStatisticalInformationImpl implements CIM_FibrePortEventCounters {
	/**
	 * The default value of the '{@link #getPLOGIsReceived() <em>PLOG Is Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGIsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long PLOG_IS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPLOGIsReceived() <em>PLOG Is Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGIsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long plogIsReceived = PLOG_IS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPLOGIsSent() <em>PLOG Is Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGIsSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long PLOG_IS_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPLOGIsSent() <em>PLOG Is Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGIsSent()
	 * @generated
	 * @ordered
	 */
	protected Long plogIsSent = PLOG_IS_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEOFAbortsReceived() <em>EOF Aborts Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOFAbortsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long EOF_ABORTS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEOFAbortsReceived() <em>EOF Aborts Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOFAbortsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long eofAbortsReceived = EOF_ABORTS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEOFAbortsTransmitted() <em>EOF Aborts Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOFAbortsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long EOF_ABORTS_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEOFAbortsTransmitted() <em>EOF Aborts Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOFAbortsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long eofAbortsTransmitted = EOF_ABORTS_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPLOGOsReceived() <em>PLOG Os Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGOsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long PLOG_OS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPLOGOsReceived() <em>PLOG Os Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGOsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long plogOsReceived = PLOG_OS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPLOGOsSent() <em>PLOG Os Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGOsSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long PLOG_OS_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPLOGOsSent() <em>PLOG Os Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGOsSent()
	 * @generated
	 * @ordered
	 */
	protected Long plogOsSent = PLOG_OS_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPLOGIsRejected() <em>PLOG Is Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGIsRejected()
	 * @generated
	 * @ordered
	 */
	protected static final Long PLOG_IS_REJECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPLOGIsRejected() <em>PLOG Is Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGIsRejected()
	 * @generated
	 * @ordered
	 */
	protected Long plogIsRejected = PLOG_IS_REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPLOGOsRejected() <em>PLOG Os Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGOsRejected()
	 * @generated
	 * @ordered
	 */
	protected static final Long PLOG_OS_REJECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPLOGOsRejected() <em>PLOG Os Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLOGOsRejected()
	 * @generated
	 * @ordered
	 */
	protected Long plogOsRejected = PLOG_OS_REJECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FibrePortEventCountersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FibrePortEventCounters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPLOGIsReceived() {
		return plogIsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPLOGIsReceived(Long newPLOGIsReceived) {
		Long oldPLOGIsReceived = plogIsReceived;
		plogIsReceived = newPLOGIsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_RECEIVED, oldPLOGIsReceived, plogIsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPLOGIsSent() {
		return plogIsSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPLOGIsSent(Long newPLOGIsSent) {
		Long oldPLOGIsSent = plogIsSent;
		plogIsSent = newPLOGIsSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_SENT, oldPLOGIsSent, plogIsSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEOFAbortsReceived() {
		return eofAbortsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEOFAbortsReceived(Long newEOFAbortsReceived) {
		Long oldEOFAbortsReceived = eofAbortsReceived;
		eofAbortsReceived = newEOFAbortsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_RECEIVED, oldEOFAbortsReceived, eofAbortsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEOFAbortsTransmitted() {
		return eofAbortsTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEOFAbortsTransmitted(Long newEOFAbortsTransmitted) {
		Long oldEOFAbortsTransmitted = eofAbortsTransmitted;
		eofAbortsTransmitted = newEOFAbortsTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_TRANSMITTED, oldEOFAbortsTransmitted, eofAbortsTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPLOGOsReceived() {
		return plogOsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPLOGOsReceived(Long newPLOGOsReceived) {
		Long oldPLOGOsReceived = plogOsReceived;
		plogOsReceived = newPLOGOsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_RECEIVED, oldPLOGOsReceived, plogOsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPLOGOsSent() {
		return plogOsSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPLOGOsSent(Long newPLOGOsSent) {
		Long oldPLOGOsSent = plogOsSent;
		plogOsSent = newPLOGOsSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_SENT, oldPLOGOsSent, plogOsSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPLOGIsRejected() {
		return plogIsRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPLOGIsRejected(Long newPLOGIsRejected) {
		Long oldPLOGIsRejected = plogIsRejected;
		plogIsRejected = newPLOGIsRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_REJECTED, oldPLOGIsRejected, plogIsRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPLOGOsRejected() {
		return plogOsRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPLOGOsRejected(Long newPLOGOsRejected) {
		Long oldPLOGOsRejected = plogOsRejected;
		plogOsRejected = newPLOGOsRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_REJECTED, oldPLOGOsRejected, plogOsRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ResetCounter(Integer SelectedCounter) {
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
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_RECEIVED:
				return getPLOGIsReceived();
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_SENT:
				return getPLOGIsSent();
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_RECEIVED:
				return getEOFAbortsReceived();
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_TRANSMITTED:
				return getEOFAbortsTransmitted();
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_RECEIVED:
				return getPLOGOsReceived();
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_SENT:
				return getPLOGOsSent();
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_REJECTED:
				return getPLOGIsRejected();
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_REJECTED:
				return getPLOGOsRejected();
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
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_RECEIVED:
				setPLOGIsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_SENT:
				setPLOGIsSent((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_RECEIVED:
				setEOFAbortsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_TRANSMITTED:
				setEOFAbortsTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_RECEIVED:
				setPLOGOsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_SENT:
				setPLOGOsSent((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_REJECTED:
				setPLOGIsRejected((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_REJECTED:
				setPLOGOsRejected((Long)newValue);
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
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_RECEIVED:
				setPLOGIsReceived(PLOG_IS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_SENT:
				setPLOGIsSent(PLOG_IS_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_RECEIVED:
				setEOFAbortsReceived(EOF_ABORTS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_TRANSMITTED:
				setEOFAbortsTransmitted(EOF_ABORTS_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_RECEIVED:
				setPLOGOsReceived(PLOG_OS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_SENT:
				setPLOGOsSent(PLOG_OS_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_REJECTED:
				setPLOGIsRejected(PLOG_IS_REJECTED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_REJECTED:
				setPLOGOsRejected(PLOG_OS_REJECTED_EDEFAULT);
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
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_RECEIVED:
				return PLOG_IS_RECEIVED_EDEFAULT == null ? plogIsReceived != null : !PLOG_IS_RECEIVED_EDEFAULT.equals(plogIsReceived);
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_SENT:
				return PLOG_IS_SENT_EDEFAULT == null ? plogIsSent != null : !PLOG_IS_SENT_EDEFAULT.equals(plogIsSent);
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_RECEIVED:
				return EOF_ABORTS_RECEIVED_EDEFAULT == null ? eofAbortsReceived != null : !EOF_ABORTS_RECEIVED_EDEFAULT.equals(eofAbortsReceived);
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__EOF_ABORTS_TRANSMITTED:
				return EOF_ABORTS_TRANSMITTED_EDEFAULT == null ? eofAbortsTransmitted != null : !EOF_ABORTS_TRANSMITTED_EDEFAULT.equals(eofAbortsTransmitted);
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_RECEIVED:
				return PLOG_OS_RECEIVED_EDEFAULT == null ? plogOsReceived != null : !PLOG_OS_RECEIVED_EDEFAULT.equals(plogOsReceived);
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_SENT:
				return PLOG_OS_SENT_EDEFAULT == null ? plogOsSent != null : !PLOG_OS_SENT_EDEFAULT.equals(plogOsSent);
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_IS_REJECTED:
				return PLOG_IS_REJECTED_EDEFAULT == null ? plogIsRejected != null : !PLOG_IS_REJECTED_EDEFAULT.equals(plogIsRejected);
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS__PLOG_OS_REJECTED:
				return PLOG_OS_REJECTED_EDEFAULT == null ? plogOsRejected != null : !PLOG_OS_REJECTED_EDEFAULT.equals(plogOsRejected);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS___RESET_COUNTER__INTEGER:
				return ResetCounter((Integer)arguments.get(0));
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
		result.append(" (PLOGIsReceived: ");
		result.append(plogIsReceived);
		result.append(", PLOGIsSent: ");
		result.append(plogIsSent);
		result.append(", EOFAbortsReceived: ");
		result.append(eofAbortsReceived);
		result.append(", EOFAbortsTransmitted: ");
		result.append(eofAbortsTransmitted);
		result.append(", PLOGOsReceived: ");
		result.append(plogOsReceived);
		result.append(", PLOGOsSent: ");
		result.append(plogOsSent);
		result.append(", PLOGIsRejected: ");
		result.append(plogIsRejected);
		result.append(", PLOGOsRejected: ");
		result.append(plogOsRejected);
		result.append(')');
		return result.toString();
	}

} //CIM_FibrePortEventCountersImpl
