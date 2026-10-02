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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.Diagram;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DiagramImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DiagramImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DiagramImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DiagramImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DiagramImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DiagramImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramImpl extends MinimalEObjectImpl.Container implements Diagram {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected String caption = CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getDiagram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DIAGRAM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.DIAGRAM__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.DIAGRAM__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaption(String newCaption) {
		String oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DIAGRAM__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DIAGRAM__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DIAGRAM__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.DIAGRAM__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.DIAGRAM__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.DIAGRAM__DESCRIPTION:
				return getDescription();
			case OSCALPackage.DIAGRAM__PROP:
				return getProp();
			case OSCALPackage.DIAGRAM__LINK:
				return getLink();
			case OSCALPackage.DIAGRAM__CAPTION:
				return getCaption();
			case OSCALPackage.DIAGRAM__REMARKS:
				return getRemarks();
			case OSCALPackage.DIAGRAM__UUID:
				return getUuid();
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
			case OSCALPackage.DIAGRAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.DIAGRAM__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.DIAGRAM__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.DIAGRAM__CAPTION:
				setCaption((String)newValue);
				return;
			case OSCALPackage.DIAGRAM__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.DIAGRAM__UUID:
				setUuid((String)newValue);
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
			case OSCALPackage.DIAGRAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.DIAGRAM__PROP:
				getProp().clear();
				return;
			case OSCALPackage.DIAGRAM__LINK:
				getLink().clear();
				return;
			case OSCALPackage.DIAGRAM__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
			case OSCALPackage.DIAGRAM__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.DIAGRAM__UUID:
				setUuid(UUID_EDEFAULT);
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
			case OSCALPackage.DIAGRAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.DIAGRAM__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.DIAGRAM__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.DIAGRAM__CAPTION:
				return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
			case OSCALPackage.DIAGRAM__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.DIAGRAM__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", caption: ");
		result.append(caption);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
