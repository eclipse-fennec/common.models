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

import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupLineDatatype;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.Revision;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RevisionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RevisionImpl#getPublished <em>Published</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RevisionImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RevisionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RevisionImpl#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RevisionImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RevisionImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RevisionImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevisionImpl extends MinimalEObjectImpl.Container implements Revision {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected MarkupLineDatatype title;

	/**
	 * The default value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PUBLISHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar published = PUBLISHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOscalVersion() <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscalVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OSCAL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOscalVersion() <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscalVersion()
	 * @generated
	 * @ordered
	 */
	protected String oscalVersion = OSCAL_VERSION_EDEFAULT;

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
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype remarks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getRevision();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLineDatatype getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(MarkupLineDatatype newTitle, NotificationChain msgs) {
		MarkupLineDatatype oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.REVISION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(MarkupLineDatatype newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.REVISION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.REVISION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REVISION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getPublished() {
		return published;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublished(XMLGregorianCalendar newPublished) {
		XMLGregorianCalendar oldPublished = published;
		published = newPublished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REVISION__PUBLISHED, oldPublished, published));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModified(XMLGregorianCalendar newLastModified) {
		XMLGregorianCalendar oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REVISION__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REVISION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOscalVersion() {
		return oscalVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOscalVersion(String newOscalVersion) {
		String oldOscalVersion = oscalVersion;
		oscalVersion = newOscalVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REVISION__OSCAL_VERSION, oldOscalVersion, oscalVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.REVISION__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.REVISION__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(MarkupMultilineDatatype newRemarks, NotificationChain msgs) {
		MarkupMultilineDatatype oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.REVISION__REMARKS, oldRemarks, newRemarks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(MarkupMultilineDatatype newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.REVISION__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.REVISION__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REVISION__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.REVISION__TITLE:
				return basicSetTitle(null, msgs);
			case OSCALPackage.REVISION__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.REVISION__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.REVISION__REMARKS:
				return basicSetRemarks(null, msgs);
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
			case OSCALPackage.REVISION__TITLE:
				return getTitle();
			case OSCALPackage.REVISION__PUBLISHED:
				return getPublished();
			case OSCALPackage.REVISION__LAST_MODIFIED:
				return getLastModified();
			case OSCALPackage.REVISION__VERSION:
				return getVersion();
			case OSCALPackage.REVISION__OSCAL_VERSION:
				return getOscalVersion();
			case OSCALPackage.REVISION__PROP:
				return getProp();
			case OSCALPackage.REVISION__LINK:
				return getLink();
			case OSCALPackage.REVISION__REMARKS:
				return getRemarks();
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
			case OSCALPackage.REVISION__TITLE:
				setTitle((MarkupLineDatatype)newValue);
				return;
			case OSCALPackage.REVISION__PUBLISHED:
				setPublished((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.REVISION__LAST_MODIFIED:
				setLastModified((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.REVISION__VERSION:
				setVersion((String)newValue);
				return;
			case OSCALPackage.REVISION__OSCAL_VERSION:
				setOscalVersion((String)newValue);
				return;
			case OSCALPackage.REVISION__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.REVISION__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.REVISION__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
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
			case OSCALPackage.REVISION__TITLE:
				setTitle((MarkupLineDatatype)null);
				return;
			case OSCALPackage.REVISION__PUBLISHED:
				setPublished(PUBLISHED_EDEFAULT);
				return;
			case OSCALPackage.REVISION__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case OSCALPackage.REVISION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case OSCALPackage.REVISION__OSCAL_VERSION:
				setOscalVersion(OSCAL_VERSION_EDEFAULT);
				return;
			case OSCALPackage.REVISION__PROP:
				getProp().clear();
				return;
			case OSCALPackage.REVISION__LINK:
				getLink().clear();
				return;
			case OSCALPackage.REVISION__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
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
			case OSCALPackage.REVISION__TITLE:
				return title != null;
			case OSCALPackage.REVISION__PUBLISHED:
				return PUBLISHED_EDEFAULT == null ? published != null : !PUBLISHED_EDEFAULT.equals(published);
			case OSCALPackage.REVISION__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case OSCALPackage.REVISION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case OSCALPackage.REVISION__OSCAL_VERSION:
				return OSCAL_VERSION_EDEFAULT == null ? oscalVersion != null : !OSCAL_VERSION_EDEFAULT.equals(oscalVersion);
			case OSCALPackage.REVISION__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.REVISION__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.REVISION__REMARKS:
				return remarks != null;
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
		result.append(" (published: ");
		result.append(published);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(", version: ");
		result.append(version);
		result.append(", oscalVersion: ");
		result.append(oscalVersion);
		result.append(')');
		return result.toString();
	}

} //RevisionImpl
